package Array;

// Array is a collection of variables of same type . Array stores only homogeneous values.

public class Array {
    public static void main(String[]args){
         int[] arr = null;      // Declaration
         arr = new int[5];      // Initialization

        System.out.println(arr.length);

        // Indexing in array is from 0 to arr.length-1
        // Updating array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        System.out.println(arr[1]);
    }
}
