package DZ5;

public class Enimal {
    public static int dogCount;
    public  static int catCount;
    public static int animalCount;

    public void run(int dist,String name){
        String nameClass=this.getClass().getSimpleName();
        if (nameClass.equals("Dog") && (dist<=500)) {
            System.out.println("Dog "+name+" ran "+dist);
        } else if (nameClass.equals("Cat") && (dist<=200)) {
            System.out.println("Cat " +name+" ran "+dist);
        } else {
            System.out.println(nameClass+" "+name+" can not run "+dist);
        }

}
    public void swim(int dist,String name){
        String nameClass=this.getClass().getSimpleName();
        if (nameClass.equals("Dog") && (dist<=10)) {
            System.out.println("Dog "+name+" swim "+dist);
        } else if (nameClass.equals("Cat")) {
            System.out.println("Cat is not swim");
        }
        else {
            System.out.println(nameClass+" "+name+" can not swim "+dist);}
    }
    public static void main(String[] args) {
        Dog bobik = new Dog();
        bobik.run(150,"bobik");
        bobik.swim(10,"bobik");
        Dog charik = new Dog();
        charik.run(600,"charik");
        charik.swim(100,"charik");
        Dog kraken = new Dog();
        kraken.swim(150,"kraken");
        Cat vaska = new Cat();
        vaska.run(150,"vaska");
        Cat myrchik= new Cat();
        myrchik.swim(150,"myrchik");

        System.out.println("All create animal = " + Enimal.animalCount);
        System.out.println("All create Dog = " + Enimal.dogCount);
        System.out.println("All create Cat = " + Enimal.catCount);
    }

}
class Dog extends Enimal {
    Dog() {
        Enimal.animalCount+=1;
        Enimal.dogCount += 1;
    }
}
class Cat extends Enimal {
    Cat() {
        Enimal.catCount += 1;
        Enimal.animalCount+= 1;
    }
    }
