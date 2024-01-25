package factory;

import touragent.Tour;

public interface TourFactory {
    Tour createTour(String name, double price);
}