package DZ_04_2;

public class Main {
    public static String answer;

    public static void main(String[] args) {
        int k;
        String obstacle, name;
        Participant[] participant = {new Man(500, 2), new Cat(200, 3), new Robot(1000, 1)};
        Perehkoda[] perehkoda = {new Treadmill(3), new Treadmill(2), new Wall(2),
                new Treadmill(100), new Wall(3)};
        for (Participant p : participant) {
            k=0;
            name = p.getClass().getSimpleName();

            for (Perehkoda pe : perehkoda) {
                k += 1;
                obstacle = pe.getClass().getSimpleName();
                if (obstacle.equals("Treadmill")) {
                    answer = pe.overcome(p.Runing(),pe.Treadmil());
                } else if (obstacle.equals("Wall")){
                    answer= pe.overcome(p.Jumping(),pe.Wall());
                }
                if (answer.equals("yes")){
                    System.out.println("Participant "+name+" passed the obstacle "+obstacle+" at the distance "+k);
                }
                else {System.out.println("Participant "+name+" no passed the obstacle "+obstacle+" at the distanc "+k+" Passed "+(k-1));
                break;}
            }
        }
    }
}