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
                    + tour.getName() + " повышена.");
        } else {
            System.out.println("Уведомление для клиента " + clientName + ": цена на тур "
                    + tour.getName() + " снижена.");
        }
    }
}