package dz12;

public class Main {
    public static void main(String[] args) {

        Box<Fruit> box1=new Box<>(new Apple());
        Box<Fruit> box2=new Box<>(new Apple());
        Box<Fruit> box3=new Box<>(new Orange());
        Box<Fruit> box4=new Box<>(new Orange());

        box1.add();
        box2.adds(3);
        box3.adds(3);
        box4.adds(2);

        box2.compare(box4);
        box1.merge(box2);
    }
}
