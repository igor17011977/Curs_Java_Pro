package dz17.second;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Products {
    public static List<Product> products() {
        ArrayList<Product> productArrayList = new ArrayList<>();
        productArrayList.addAll(Arrays.asList(
                new Product("Book", 230, false),
                new Product("Table", 260, false),
                new Product("Book", 300, true),
                new Product("Car", 23000, false),
                new Product("Table", 23, false),
                new Product("Book", 200, true),
                new Product("Book", 300, true)
        ));
        return productArrayList;
    }
}
