package Array;

import java.util.Scanner;

public class ArrayOps {
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args){

        int[] arr = takeInput();
        display(arr);

    }

    public static int[] takeInput(){
        System.out.println("Enter the size of the array ?");
        int n = scn.nextInt();
        int[]arr = new int[n];

        for (int i = 0 ; i< arr.length ; i++){
            System.out.println("Enter the value for " + i + "index");
            arr[i] = scn.nextInt();
        }
        return arr;
    }

    public static void display(int[] arr){
        for (int j : arr) {
            System.out.println(j);
        }
    }
}
