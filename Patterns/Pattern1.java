package Patterns;
//for n = 5
//Pattern - *
//          *
//          *
//          *
//          *


import java.util.Scanner;

public class Pattern1 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = 0;
        while (row<n){
            System.out.println("*");
            row++;
        }

    }
}
