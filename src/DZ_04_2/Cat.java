package DZ_04_2;

public class Cat extends Participant{
    Cat(int distans,int visota){
        this.distans=distans;
        this.visota=visota;
        System.out.println("Cat can run distans= "+distans+"m amd jump visota = "+visota+"m");
    }
}
