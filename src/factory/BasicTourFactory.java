package factory;

import touragent.Tour;

public class BasicTourFactory implements TourFactory {
    @Override
    public Tour createTour(String name, double price) {
        return new Tour(name, price);
    }
}