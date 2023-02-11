package dz15;


import java.util.Arrays;

public class Shaiker {
    public static void shakerSort(int[] arr) {
        int buffer;
        int left = 0;
        int right = arr.length - 1;
        do {
            for (int i = left; i < right; i++) {
                if (arr[i] > arr[i + 1]) {
                    buffer = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = buffer;
                }
            }
            right--;
            for (int i = right; i > left; i--) {
                if (arr[i] < arr[i - 1]) {
                    buffer = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = buffer;
                }
            }
            left++;
        } while (left < right);
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] a = {3, 6, 5, 8, 7, 9, 4, 1};
        shakerSort(a);
    }
}