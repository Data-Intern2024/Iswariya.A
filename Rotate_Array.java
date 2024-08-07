package org.example;

import java.util.Arrays;

public class Rotate_Array {
    public static void main(String[] args){
        int[] arr = {1, 2, 3, 4, 5};
        int positions = 2;
        for (int i = 0; i < positions; i++) {
            int temp = arr[arr.length - 1];
            for (int j = arr.length - 1; j > 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
