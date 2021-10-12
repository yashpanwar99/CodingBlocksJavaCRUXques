package Patterns;
//for n = 3
//Pattern - ***
//          **
//          *


import java.util.Scanner;

public class Pattern4
{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = n;
        int row = 1;
        while (row<=n){

            for (int i = 0 ; i<nst ;i++) {
                System.out.print(" * ");
            }
            System.out.println();
            row++;
            nst--;
        }

    }
}

