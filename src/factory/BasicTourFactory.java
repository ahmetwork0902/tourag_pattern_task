package factory;

import touragent.Tour;

public class BasicTourFactory implements TourFactory {
    @Override
    public Tour createTour(String name, double price) {
        if (name == null || price < 0) {
            throw new IllegalArgumentException("Некорректные параметры для создания тура");
        }
        return new Tour(name, price);
    }
}