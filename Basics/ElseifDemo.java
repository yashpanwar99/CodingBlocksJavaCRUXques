package Basics;

import java.util.Scanner;

public class ElseifDemo {
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);
        int age = scn.nextInt();

        if (age <= 10){
            System.out.println("Child");
        }else if(age>11 && age<=18){
            System.out.println("Teen");
        }else if(age>18 && age<=60){
            System.out.println("Adult");
        }else{
            System.out.println("Old");
        }


    }
}
