package touragent;

public class Booking {
    private Client client;
    private Tour tour;

    public Booking(Client client, Tour tour) {
        this.client = client;
        this.tour = tour;
    }

    public Client getClient() {
        return client;
    }

    public Tour getTour() {
        return tour;
    }
}