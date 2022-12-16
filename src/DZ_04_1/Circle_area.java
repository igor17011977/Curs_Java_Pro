package DZ_04_1;

public class Circle_area extends Figures implements square{
    double radius;
    public Circle_area(double radius){
        this.radius=radius;
    }
    @Override
    public double Square_figure() {
        System.out.println("Circle area");
        return 3.14*radius;
    }
}
