package dz17.first;

import java.util.ArrayList;
import java.util.List;

import static dz17.first.ProductType.BOOK;
import static dz17.first.ProductType.TABLE;
import static dz17.first.ProductType.CAR;


public class Main {
    Product product;

    public static void main(String[] args) {
        List<Product> productList = products();
        takeBook(productList);
    }

    public static List<Product> products() {
        ArrayList<Product> productArrayList = new ArrayList<>();
        Product product1 = new Product(BOOK, 2380);
        productArrayList.add(product1);
        productArrayList.add(new Product(BOOK, 230));
        productArrayList.add(new Product(TABLE, 260));
        productArrayList.add(new Product(BOOK, 300));
        productArrayList.add(new Product(CAR, 23000));
        productArrayList.add(new Product(TABLE, 23));
        productArrayList.add(new Product(BOOK, 200));
        productArrayList.add(new Product(BOOK, 300));
        return productArrayList;
    }

    public static void takeBook(List<Product> products) {
        products.stream().filter(fr -> BOOK.equals(fr.getType())).filter(fr -> fr.getPrices() > 250).forEach(System.out::println);
    }
}
