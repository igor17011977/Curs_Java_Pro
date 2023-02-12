package dz17.fourth;

import java.util.Comparator;

public class CompareDate  implements Comparator<Product> {
public int compare(Product a, Product b){
    return a.getDeliveryDara().compareTo(b.getDeliveryDara());
}
}
