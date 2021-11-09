package Array;

import java.util.Scanner;

public class ArrayDemoSwap {
    public static void main(String[]args){

        int[]arr = new int[5];
        for (int i = 0; i<arr.length ; i++){
            Scanner scn = new Scanner(System.in);
            arr[i] = scn.nextInt();
        }

        int i = 0;
        int j = 2;

        System.out.println(arr[i] + " , " + arr[j]);
        //Swap1(arr[i] , arr[j]);
        Swap2(arr , i ,j);
        System.out.println(arr[i] + " , " + arr[j]);
    }

    public static void Swap1(int one , int two){
        int temp = one;
        one = two;
        two = temp;
    }
    public static void Swap2(int[]arr , int one , int two){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
}

