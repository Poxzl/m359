package Unit7.Ticketmasterlab;

public class Show {
    private String date;
    private double price;
    private int quantity;
    private String performer;
    private String city;

    public Show(String date, double price, int quantity, String performer, String city) {
        this.date = date;
        this.price = price;
        this.quantity = quantity;
        this.performer = performer;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Show{" + "date='" + date + '\'' + ", price=" + price + ", quantity=" + quantity + ", performer='" + performer + '\'' + ", city='" + city + '\'' + '}';
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPerformer() {
        return performer;
    }

    public void setPerformer(String performer) {
        this.performer = performer;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
