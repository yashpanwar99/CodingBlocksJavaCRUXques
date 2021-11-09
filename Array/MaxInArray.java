package Array;

import java.util.Scanner;

public class MaxInArray {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = takeinput();
        display(arr);
        System.out.println("Max In Array is "+maxInArray(arr));
    }

    public static int[] takeinput() {
        System.out.println("Size ?");
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the value for " + i + "th index ?");
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int maxInArray(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}