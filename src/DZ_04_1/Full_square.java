package DZ_04_1;

public class Full_square {
    public static void main(String[] args){
        double full_area=0;
        double area;
        Figures[] figures={new Circle_area(12),new Square_area(5),new Triangle_area(5,5,5)};

          for (int i=0;i<3;i++) {
            area = figures[i].Square_figure();
            full_area+=area;
            System.out.println(area);
        }
        System.out.println("Full area all figures = "+full_area);

    }
}
