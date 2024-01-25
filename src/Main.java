import factory.BasicTourFactory;
import factory.TourFactory;
import observer.PriceDropObserver;
import observer.TourAgency;
import observer.TourObserver;
import touragent.Client;
import touragent.Tour;

public class Main {
    public static void main(String[] args) {
        // Создаем тур-агентство
        TourAgency tourAgency = new TourAgency();

        // Добавляем клиентов
        Client client1 = new Client("Иван");
        Client client2 = new Client("Мария");
        tourAgency.registerClient(client1);
        tourAgency.registerClient(client2);

        // Добавляем клиентов-наблюдателей
        TourObserver clientObserver1 = new PriceDropObserver("Иван");
        TourObserver clientObserver2 = new PriceDropObserver("Мария");
        tourAgency.subscribeObserver(clientObserver1);
        tourAgency.subscribeObserver(clientObserver2);

        // Создаем фабрику для создания туров
        TourFactory tourFactory = new BasicTourFactory();

        // Добавляем туры и уведомляем клиентов
        Tour tour1 = tourFactory.createTour("Экскурсия в Париж", 1500);
        tourAgency.addTour(tour1);

        Tour tour2 = tourFactory.createTour("Отдых на Мальдивах", 5000);
        tourAgency.addTour(tour2);

        Tour tour3 = tourFactory.createTour("Поездка в Египет", 2800);
        tourAgency.addTour(tour3);

        // Изменяем стоимость тура (повышаем) и уведомляем клиентов
        tour1.setPrice(1600);
        tourAgency.addTour(tour1);
        tour2.setPrice(5500);
        tourAgency.addTour(tour2);
        tour3.setPrice(3000);
        tourAgency.addTour(tour3);

        // Бронируем туры для клиентов
        tourAgency.bookTour(client1, tour1);
        tourAgency.bookTour(client2, tour3);
        tourAgency.bookTour(client2, tour2);
    }
}