package dz14;

public class ThreadSafeList {
    public synchronized void add(double a){
        PetrolStation.amount+=a;

    }
    public synchronized void remove(double a){
        PetrolStation.amount-=a;
    }
    public  synchronized double get(){
        return PetrolStation.amount;
    }
}
