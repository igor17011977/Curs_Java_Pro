package dz17.second;


public class Product {
    String type;
    int prices;
    boolean sale;

    Product(String type, int prices,boolean sale) {
        this.type = type;
        this.prices = prices;
        this.sale=sale;
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
                '}';
    }
    public static int compare(Product p1,Product p2){
        if (p1.getPrices()> p2.getPrices())
            return  -1;
        return 1;

    }
}
