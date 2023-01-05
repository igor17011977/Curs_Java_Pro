package DZ06;
import  java.util.logging.Logger;

import static java.lang.Integer.parseInt;

public class ArrayValueCalculator{
   int summaArray;
   int counter;
    private static final Logger logger = Logger.getLogger(ArrayValueCalculator.class.getName());
    static class ArraySizeException extends Exception{
        private int a;
        ArraySizeException(int a){
            this.a=a;
        }
        @Override
        public String toString(){
            return ("Array list have "+this.a+" elements");
        }
 }
    static class ArrayDataException extends Exception{
        private int b;
        ArrayDataException(int a){
            this.b=a;
        }
        @Override
        public String toString(){
            return ("Cell "+this.b+" contains a string value, conversion to int is not possible ");
        }
    }
    public int doCalc(String[][] array) throws ArraySizeException {

        if (array.length > 4) throw new ArraySizeException(array.length);
        for (String[] redo : array
            ) {
                for (String sim : redo
                ) {
                    try {
                        counter+=1;
                    int v=parseInt(sim);
                    this.summaArray+=v;
                    }catch (NumberFormatException e){System.out.println(new ArrayDataException(counter));}
                }
            }
        return this.summaArray;
    }
    public static void main(String[] args) throws ArraySizeException {
        String[][] array={{"1","s","5","7"},
                {"1","s","5","7"},
                {"1","s","5","7"},
                {"1","s","5","7"}};
        try {
            String[][] array1 = new String[5][5];
            new ArrayValueCalculator().doCalc(array1);
        }catch (ArraySizeException e){
            logger.warning(""+e);
        }
        System.out.println(new ArrayValueCalculator().doCalc(array));
        //1
        }
    }

