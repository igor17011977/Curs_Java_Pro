package dz17.third;

import dz17.second.Product;

import java.util.List;
import java.util.NoSuchElementException;

import static dz17.second.Products.products;

public class Main {

    static List<Product> productList;

    public static void main(String[] args) {
        productList = products();
        takeProduct("Book");
    }

    public static void takeProduct(String type) {
        try {
            Product min = productList.stream().filter(fr -> fr.getType().equals(type)).min(Product::compare).get();
            System.out.println(min.getType() + " " + min.getPrices());
        } catch (NoSuchElementException e) {
            System.out.println("Product [Category"+type +"] not find]");
        }
    }
}

