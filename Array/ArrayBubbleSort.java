package Array;

import java.util.Scanner;

public class ArrayBubbleSort {
static Scanner scn = new Scanner(System.in);
public static void main(String[]args){
    int[]arr = {99,88,77,66,55,44,33,22,11};
    bubblesort(arr);
    display(arr);
   }

   public static void bubblesort(int[]arr){
    for(int counter = 0; counter< arr.length-1 ; counter++){
        for (int j =0 ; j<arr.length-1-counter; j++){
            if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
            }
        }
    }
   }

   public static void display(int[]arr){
    for(int i =0; i<arr.length; i++){
         System.out.println(arr[i]);
      }
   }
}
