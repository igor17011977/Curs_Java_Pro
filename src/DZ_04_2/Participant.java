package DZ_04_2;

public class Participant implements Run_and_Jamp{
    int distans;
    int visota;
    @Override
    public int Runing() {
        return this.distans;
    }

    @Override
    public int Jumping() {
        return this.visota;
    }
}
