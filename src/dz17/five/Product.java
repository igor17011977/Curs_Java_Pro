package dz17.five;

import java.time.LocalDate;

public class Product {
    String type;
    int prices;
    boolean sale;
    LocalDate deliveryDara;

    Product(String type, int prices, boolean sale, LocalDate deliveryDara) {
        this.type = type;
        this.prices = prices;
        this.sale = sale;
        this.deliveryDara=deliveryDara;
    }

    public String getType() {
        return type;
    }

    public int getPrices() {
        return prices;
    }

    public boolean isSale() {
        return sale;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", prices=" + prices +
                ", sale=" + sale +
                ", deliveryDara=" + deliveryDara +
                '}';
    }

    public LocalDate getDeliveryDara() {
        return deliveryDara;
    }
}
