package DZ_04_1;

public class Square_area extends Figures implements square{
    double a;
    public Square_area(double a){
        this.a=a;
    }

    @Override
    public double Square_figure() {
        System.out.println("Square area");
        return a*a;
    }
}
