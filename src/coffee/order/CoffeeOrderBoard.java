package coffee.order;

public class CoffeeOrderBoard extends Main {
    public void add(String order) {
        orderHashMap.put(position, order);
        queue.add(position);
    }
    public void deliver() {
        queue.remove();
    }
    public void deliver(int number) {
        queue.remove(number);
    }
    public void draw() {
        System.out.println("Num | Name");
        for (Integer e : queue) {
            System.out.println(e + " | " + namehashMap.get(e).name);

        }
    }
}