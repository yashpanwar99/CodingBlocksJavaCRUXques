package Array;

import java.util.Scanner;

public class LinearSearch {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = {10, 5, 20, 30, 25};
        System.out.println("Enter the number to be searched ");
        int n = scn.nextInt();
        System.out.println("It is present at thus index = " + linearSearch(arr, n));
    }

    public static int linearSearch(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return i;
            }
        }
        return -1;
    }
}