package TwoDArrayandArraylist;

import java.util.Scanner;

public class TakeInputandDisplayTwoDArray {
public static void main(String[]args){
    int[][]arr =takeInput();
    display(arr);

    }

    public static int[][] takeInput(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the no. of rows ");
        int rows = scn.nextInt();
        int[][]arr = new int[rows][];

        for(int row = 0; row<rows;row++){
            System.out.println("Enter the no of cols for row " + row);
            int cols = scn.nextInt();
            arr[row] = new int[cols];
            for(int col=0;col<cols;col++){
                System.out.println("Enter the value for row " + row + " and col " + col);
                arr[row][col] = scn.nextInt();
            }

        }
        return arr;
    }
    public static void display(int[][]arr){
        for (int i =0; i<arr.length ; i++){
            for (int j =0 ; j<arr[i].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
