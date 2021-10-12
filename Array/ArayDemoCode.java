package Array;

public class ArayDemoCode {
    public static void main(String[]args){

        // Declare
        int[]arr = null;
        System.out.println(arr);

        // Allocate Space
        arr = new int[5];
        System.out.println(arr);

        // Get
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // Set
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // Get
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        // Optimized Way
        for (int i = 0; i<arr.length ; i++){
            System.out.println(arr[i]);
        }

        // Enhanced For Loop
        for (int val : arr) {
            System.out.println(val);
        }

        // Limitation of enhanced for Loop is that it is only foeward going
    }
}
