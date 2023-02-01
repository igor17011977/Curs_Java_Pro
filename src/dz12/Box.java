package dz12;

public class Box<T extends Fruit> {
    int quantity = 0;
    T fruit;

    public Box(T o) {
        this.fruit = o;
    }

    public void add() {
        this.quantity += 1;
    }

    public void adds(int quantity) {
        this.quantity += quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public T getFruit() {
        return fruit;
    }

    public double getWeight() {
        return quantity * fruit.veight;
    }

    public void compare(Box<T> o) {
        double b = getWeight();
        double c = o.getWeight();
        System.out.println(b == c);
    }

    public void merge(Box<T> o) {
        if (o.fruit.getClass().getSimpleName().equals(fruit.getClass().getSimpleName())) {
            this.quantity = o.quantity + this.quantity;
            o.quantity=0;
        }
        System.out.println(this.quantity);
        System.out.println(o.quantity);
    }
}
