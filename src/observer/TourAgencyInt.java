package observer;

import touragent.Client;
import touragent.Tour;

public interface TourAgencyInt {
    void subscribeObserver(TourObserver observer);
    void unsubscribeObserver(TourObserver observer);
    void addTour(Tour tour);
    void registerClient(Client client);
    void bookTour(Client client, Tour tour);
}
