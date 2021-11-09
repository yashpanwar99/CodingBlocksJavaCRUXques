package TwoDArrayandArraylist;

public class OtherImportantConcepts {
    public static void main(String[]args){
        int[][]arr = new int[4][];
 //        int[][]arr = new int[][4]; This is wrong and the main array is not created which stores the data of these secondary arrays.

        // In 2D array we can also create each row of different size arrays.

        int[][]arr1 = new int[4][];
        arr1[0] = new int[4];
        arr1[1] = new int[2];
        arr1[2] = new int[3];
        arr1[3] = new int[2];
    }
}
