package dz17.fourth;

import java.util.List;

public class Main {


    public static void main(String[] args) {
        takeProduct();
    }

    public static void takeProduct() {
        List<Product> productList = Products.products();
        productList.stream().sorted(new CompareDate()).skip(productList.size() - 3).forEach(System.out::println);

    }
}
