package dz17.second;

import java.util.List;

import static dz17.second.Products.products;


public class Main {
    Product product;

    public static void main(String[] args) {
        List<Product> productList = products();
        takeProduct(productList,10,"Book");
    }
    public static void takeProduct(List<Product> products, int sale, String type) {
        products.stream().filter(fr -> fr.getType().equals(type))
                .map(fr->fr.getType()+" preisec with sale= "+(fr.getPrices()-fr.getPrices()*sale/100))
                .forEach(System.out::println);
    }
}
