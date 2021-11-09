package TwoDArrayandArraylist;

public class TwoDarrayPractical {
    public static void main(String[]args){

    // Ways to declare and initialised a 2d array

        //M-1
        int[][]arr1 = null;
        arr1 = new int[3][3];

        //M-2
        int[][]arr2 = new int[3][3];

        //M-3
        int[][]arr3 = {{1,2,3},{4,5,6},{7,8,9}};

        display(arr3);
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
