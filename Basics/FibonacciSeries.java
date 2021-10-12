package Basics;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int counter = 0;
        int a = 0;
        int b = 1;

        while(counter<=n){
            System.out.println(a);
            int sum = a+b;
            a = b;
            b = sum;
            counter++;
        }

    }
}
