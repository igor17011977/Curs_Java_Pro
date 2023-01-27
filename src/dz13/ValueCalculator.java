package dz13;



public class ValueCalculator  {
    float[] massiv;
    int size = 1000000;
    int half = 500000;
    float[] arr1 = new float[half];
    float[] arr2 = new float[half];
    long time;

    public void method() {
        time = System.currentTimeMillis();

        massiv = new float[size];
        for (int i=0;i<size;i++){
            massiv[i] = 1;
        }

        System.arraycopy(massiv, 0, arr1, 0, half);
        System.arraycopy(massiv, half, arr2, 0, half);
    }
    public void method1() {
        System.arraycopy(arr1,0,massiv,0,half);
        System.arraycopy(arr2,0,massiv,half,half);
    }
    public float[] getArr1() {
        return arr1;
    }

    public float[] getArr2() {
        return arr2;
    }
    public long getTime() {
        return time;
    }
}

