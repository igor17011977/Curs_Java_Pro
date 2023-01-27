package dz13;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ValueCalculator valueCalculator = new ValueCalculator();
        valueCalculator.method();
        ThreadNew threadNew1=new ThreadNew(valueCalculator.arr1);
        ThreadNew threadNew2=new ThreadNew(valueCalculator.arr2);
        threadNew1.t.start();
        threadNew2.t.start();
        try {
            threadNew1.t.join();
            threadNew2.t.join();
        }catch (InterruptedException e){
            threadNew1.t.interrupt();
            threadNew2.t.interrupt();
        }finally {
            valueCalculator.method1();
            System.out.println(valueCalculator.getTime());
        }
    }
}