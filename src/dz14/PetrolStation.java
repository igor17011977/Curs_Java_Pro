package dz14;

public class PetrolStation implements Runnable {
    private static PetrolStation instance;
    static double amount=300;
    public void doRefuel(double a){
        amount-=a;
        run();
//        return  amount;
    }
    public static PetrolStation getInstance(){
        if (instance==null){
            instance=new PetrolStation();
        }
        return instance;
    }
    public  void run(){
        try {
            Thread.sleep(3000);
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
