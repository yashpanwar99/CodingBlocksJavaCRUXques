package Strings;

public class DemoStringPerformance {
    public static void main (String[]args){
        long start = System.currentTimeMillis();
        appendString(100000);
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
    public static void appendString(int n){
        String s = " ";
        for(int i=1 ; i<=n ; i++){
            s= s+i;
        }
    }
}
