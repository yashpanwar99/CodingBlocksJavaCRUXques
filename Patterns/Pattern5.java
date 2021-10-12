package Patterns;
//for n = 3
//Pattern -   *
//           **
//          ***

import java.util.Scanner;
public class Pattern5
{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int nst = 1;
        int nsp = n-1;
        int row = 1;
        while (row<=n){

            for (int i = 0 ; i<nst ;i++) {
                System.out.print(" * ");
            }
            System.out.println();
            row++;
            nst++;
        }

    }
}


