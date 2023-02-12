package dz17.first;

public class Product {
    ProductType type;
    int prices;
    Product(ProductType type, int prices){
        this.type=type;
        this.prices=prices;
    }

    public ProductType getType() {
        return type;
    }

    public int getPrices() {
        return prices;
    }

    @Override
    public String toString() {
        return "Product{" +
                "type=" + type +
                ", prices=" + prices +
                '}';
    }
}
