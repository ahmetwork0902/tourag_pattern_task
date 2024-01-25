package observer;

import touragent.Tour;

public class PriceDropObserver implements TourObserver {
    private String clientName;

    public PriceDropObserver(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public void update(Tour tour) {
        if (tour.isPriceIncreased()) {
            System.out.println("Уведомление для клиента " + clientName + ": цена на тур "
                    + tour.getName() + " повышена и составляет " + tour.getPrice() + " у.е.");
        } else {
            System.out.println("Уведомление для клиента " + clientName + ": цена на тур "
                    + tour.getName() + " снижена и составляет " + tour.getPrice() + " у.е.");
        }
    }
}