package dz15;

import java.util.Arrays;

public  class QuickSort {
    public static void  sort(int[] array,int low,int high){
        if (array.length==0 || low>=high){
            return;
        }
        int a=low+(high-low)/2;
        int opora=array[a];
        int i=low;
        int j=high;
        while (i<=j){
            while (array[i]<opora)i++;
            while (array[j]>opora)j--;
            if (i<=j){
                var sw=array[i];
                array[i]=array[j];
                array[j]=sw;
                i++;
                j--;
            }
        }
        if (low<j)sort(array,low,j);
        if (high>i)sort(array,i,high);
    }

    public static void main(String[] args) {
        int [] sortArray={10,5,8,9,13,1,4,6,2};
        sort(sortArray,0,sortArray.length-1);
        System.out.println(Arrays.toString(sortArray));

    }
}
