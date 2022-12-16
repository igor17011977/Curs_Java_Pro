package DZ_04_1;

public class Triangle_area extends Figures implements square{
    double a,b,c;
    public Triangle_area(double a,double b,double c){
        this.a=a;
        this.b=b;
        this.c=c;

    }

    @Override
    public double Square_figure() {
        double perimeter = (a + b + c) / 2;
        System.out.println("Triangle area");
        return Math.sqrt(perimeter *(perimeter -a)*(perimeter -b)*(perimeter -c));
    }

}
