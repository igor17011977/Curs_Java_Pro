package DZ_04_2;

public class Robot extends Participant{
    Robot(int distans,int visota){
        this.distans=distans;
        this.visota=visota;
        System.out.println("Robot can run distans= "+distans+"m amd jump visota = "+visota+"m");
    }
}
