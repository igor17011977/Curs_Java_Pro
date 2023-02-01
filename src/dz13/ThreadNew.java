package dz13;

public class ThreadNew implements Runnable{
    Thread t;
    float[] arr;
    public ThreadNew(float[] arr) {
        t=new Thread(this);
        this.arr=arr;
    }
    @Override
    public void run() {
        for (int i = 0; i < arr.length; i++) {
                arr[i] = (float) (arr[i] * Math.sin(0.2f + (float)i / 5) * Math.cos(0.2f + (float) i / 5) * Math.cos((0.4f + (float) i / 2)));
            }
    }
}
