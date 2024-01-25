package observer;

import touragent.Booking;
import touragent.Client;
import touragent.Tour;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class TourAgency extends Observable {
    private List<TourObserver> observers = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();
    private List<Booking> bookings = new ArrayList<>();

    public void addObserver(TourObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(TourObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Tour tour) {
        for (TourObserver observer : observers) {
            observer.update(tour);
        }
    }

    public void addTour(Tour tour) {
        setChanged();
        notifyObservers(tour);
    }

    public void registerClient(Client client) {
        clients.add(client);
    }

    public void bookTour(Client client, Tour tour) {
        Booking booking = new Booking(client, tour);
        bookings.add(booking);
        System.out.println("Бронирование тура " + tour.getName() + " для клиента " + client.getName());
    }
}
