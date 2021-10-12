package Functions;

import java.util.Scanner;

public class FunctionsDemoParameters {
    public static void main (String[]args){

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();

        addParams(a , b);
    }
    public static void addParams(int m , int n){
        int sum = m + n;
        System.out.println("Sum is " + sum);
    }
}
