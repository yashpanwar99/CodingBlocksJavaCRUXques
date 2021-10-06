package Basics;

import java.util.Scanner;

public class PrimeOrNonPrime {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int divisor = 2;
        boolean flag = true;

        while(divisor<n){
            if(n%divisor == 0){
                flag = false;
            }
            divisor++;
        }
        if(flag == true){
            System.out.println("Prime");
        }else {
            System.out.println("Not Prime");
        }
    }
}
