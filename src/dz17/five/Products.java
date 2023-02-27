package dz17.five;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Products {
    public static List<Product> products() {
        ArrayList<Product> productArrayList = new ArrayList<>();
        productArrayList.addAll(Arrays.asList(
                new Product("Book", 20, false, LocalDate.of(2023,2,1)),
                new Product("Table", 260, false,LocalDate.of(2022,9,15)),
                new Product("Book", 300, true,LocalDate.of(2023,3,1)),
                new Product("Car", 23000, false,LocalDate.of(2022,7,22)),
                new Product("Table", 23, false,LocalDate.of(2023,1,1)),
                new Product("Book", 200, true,LocalDate.of(2022,4,9)),
                new Product("Book", 30, true,LocalDate.of(2023,1,10))
        ));
        return productArrayList;
    }
}
