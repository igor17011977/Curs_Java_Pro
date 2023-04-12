package dz22;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MainRun {
    static int position;
    static Map<Integer, Order> hashMap = new HashMap<>();
    public static void main(String[] args) {
        CoffeOrderBoard coffeOrderBoard=new CoffeOrderBoard();
        String[] name = {"Igor", "Aleksandr", "Kolya", "Sveta", "Tania", "Sofia"};
        Arrays.stream(name).forEach(e-> hashMap.put(++position, new Order(position,e)));
        CoffeOrderBoard.add(new Order(++position,"Stas"));
        System.out.println(hashMap.toString());
        coffeOrderBoard.deliver();
        System.out.println(hashMap.toString());

        coffeOrderBoard.deliver(5);
        System.out.println(hashMap.toString());
        coffeOrderBoard.draw();
    }
}
