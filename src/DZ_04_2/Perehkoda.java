package DZ_04_2;

public class Perehkoda implements Treadmil_and_Wall {
    int treadmill_distans;
    int wall_height;
    @Override
    public int Treadmil() {
        return this.treadmill_distans;
    }

    @Override
    public int Wall() {
        return this.wall_height;
    }

    @Override
    public String overcome(int participant,int treadmill_wall) {
        if (participant>treadmill_wall){
            return "yes";}
        else return "no";

    }
}
