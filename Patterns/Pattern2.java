package Patterns;
//for n = 3
//Pattern - ***
//          ***
//          ***


import java.util.Scanner;

public class Pattern2 {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int row = 0;
        while (row<n){
            for (int i = 0 ; i<n ;i++) {
                System.out.print(" * ");
            }
            System.out.println();
            row++;
        }

    }
}
