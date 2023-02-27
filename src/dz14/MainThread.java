package dz14;

public class MainThread{
    public static void main(String[] args) {
        PetrolStation petrolStation=new PetrolStation();
        ThreadSafeList threadSafeList=new ThreadSafeList();
        threadSafeList.add(10);
        threadSafeList.add(10);
        threadSafeList.add(10);
        threadSafeList.remove(10);
        threadSafeList.remove(20);
        threadSafeList.add(10);
        threadSafeList.add(20);
        petrolStation.run();
    }
}
