package touragent;

public class Tour {
    private String name;
    private double price;

    public Tour(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}