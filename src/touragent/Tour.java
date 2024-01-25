package touragent;

public class Tour {
    private String name;
    private double price;
    private boolean priceIncreased;

    public Tour(String name, double price) {
        this.name = name;
        this.price = price;
        this.priceIncreased = false;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        if (newPrice > this.price) {
            this.priceIncreased = true;
        } else {
            this.priceIncreased = false;
        }
        this.price = newPrice;
    }

    public boolean isPriceIncreased() {
        return priceIncreased;
    }
}