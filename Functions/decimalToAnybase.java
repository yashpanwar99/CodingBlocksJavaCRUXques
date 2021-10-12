package Functions;

import java.util.Scanner;

public class decimalToAnybase {
    public static void main(String[]args) {
        Scanner scn = new Scanner(System.in);
        int snum = scn.nextInt();
        int db = scn.nextInt();
        int res = decimalToAnybase(snum,db);
        System.out.println(res);
    }
    public static int decimalToAnybase(int snum , int db){
        int ans = 0;
        int multiplier = 1;
        while(snum!=0){
            int rem = snum % db;
            ans = ans + (rem * multiplier);
            multiplier = multiplier * 10;
            snum = snum/db;
        }
        return ans;
    }
}
