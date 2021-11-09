package Array;

import java.util.Scanner;

public class SelectionSort {
    static Scanner scn = new Scanner(System.in);
    public static void main(String[]args){

        int[]arr = {99,88,77,66,55,44,33,22,11};
        selectionsort(arr);
        display(arr);
    }
    public static void selectionsort(int[]arr){
        for(int counter=0; counter<arr.length-1 ; counter++){
            int min=counter;
            for(int j=counter+1;j<arr.length;j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            int temp = arr[min];
            arr[min] = arr[counter];
            arr[counter] = temp;
            }
        }
    }

    public static void display(int[]arr) {
        for (int i = 0; i < arr.length; i++) {
             System.out.println(arr[i]);
        }
    }
}
