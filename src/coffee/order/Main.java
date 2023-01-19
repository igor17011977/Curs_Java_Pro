package coffee.order;

import java.util.*;

public class Main {
    static int position = 0;
    static Queue<Integer> queue = new LinkedList<>();
    static Map<Integer, String> orderHashMap = new HashMap<>();
    static Map<Integer, Order> namehashMap = new HashMap<>();

    public static void main(String[] args) {
        CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
        String[] name = {"Igor", "Aleksandr", "Kolya", "Sveta", "Tania", "Sofia"};
        String[] order = {"Late", "Americano", "Cappuccino", "Kaffee with milk", "Frappe", "Late"};
        for (int i = 0; i < name.length; i++) {
            namehashMap.put(position, new Order(name[i]));
            coffeeOrderBoard.add(order[i]);
            position++;
        }

        coffeeOrderBoard.deliver();
        coffeeOrderBoard.deliver(4);
        coffeeOrderBoard.draw();


    }
}
