package dz17.five;

import java.time.LocalDate;
import java.util.List;

import static dz17.five.Products.products;

public class Main {
    public static void main(String[] args) {
        takeProduct("Book");
    }

    public static void takeProduct(String type) {
        List<Product> productList = products();
        productList.stream()
                .filter(fr -> fr.getType().equals(type))
                .filter(fr -> fr.getPrices() <= 75)
                .filter(fr -> fr.getDeliveryDara().isAfter(LocalDate.parse("2023-01-01")))
                .forEach(System.out::println);
    }
}
