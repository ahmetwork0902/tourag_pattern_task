package observer;

import touragent.Booking;
import touragent.Client;
import touragent.Tour;

import java.util.ArrayList;
import java.util.List;

public class TourAgency implements TourAgencyInt {
    private List<TourObserver> observers = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    @Override
    public void subscribeObserver(TourObserver observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribeObserver(TourObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void addTour(Tour tour) {
        notifyObservers(tour);
    }

    @Override
    public void registerClient(Client client) {
        clients.add(client);
    }

    @Override
    public void bookTour(Client client, Tour tour) {
        Booking booking = new Booking(client, tour);
        bookings.add(booking);
        printBookingDetails(client, tour);
    }

    private void notifyObservers(Tour tour) {
        for (TourObserver observer : observers) {
            observer.update(tour);
        }
    }

    private void printBookingDetails(Client client, Tour tour) {
        System.out.println("Бронирование тура " + tour.getName() + " для клиента " + client.getName());
    }
}
