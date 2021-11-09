package Array;

import java.util.Scanner;

public class Insertionsort {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[]args){
         int[]arr = {99,88,77,66,55};
         insertionSort(arr);
         display(arr);
    }

    public static void insertionSort(int[]arr){

        for(int counter = 1; counter<=arr.length-1 ; counter++){
            int val = arr[counter];
            int j = counter-1;
            while(j>=0 && arr[j]>val){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
    }

    public static void display(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
