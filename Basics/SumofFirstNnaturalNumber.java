package Basics;

import java.util.Scanner;

public class SumofFirstNnaturalNumber {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int counter = 1;
        int sum = 0;
        while (counter<=n){
            sum = sum+counter;
            counter = counter+1;
        }
        System.out.println("Sum is " + sum);
    }
}
