package dz17.fourth;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Products {
    public static List<Product> products() {
        ArrayList<Product> productArrayList = new ArrayList<>();
        productArrayList.addAll(Arrays.asList(
                new Product("Book", 230, false, LocalDate.of(2013,2,1)),
                new Product("Table", 260, false,LocalDate.of(2012,9,15)),
                new Product("Book", 300, true,LocalDate.of(2013,3,1)),
                new Product("Car", 23000, false,LocalDate.of(2012,7,22)),
                new Product("Table", 23, false,LocalDate.of(2013,1,1)),
                new Product("Book", 200, true,LocalDate.of(2012,4,9)),
                new Product("Book", 300, true,LocalDate.of(2013,1,10))
        ));
        return productArrayList;
    }
}
