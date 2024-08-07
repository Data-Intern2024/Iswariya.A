package org.example;
public class Add_Elements_to_target {
    static int[] arr = {1, 2, 3, 4, 5};
    static int target = 7;
    public static void main(String[] args){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair: " + arr[i] + ", " + arr[j]);
                    break;
                }
            }
        }
    }
}
