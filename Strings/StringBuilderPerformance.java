package Strings;

public class StringBuilderPerformance {
    public static void main(String[]args){
    long start = System.currentTimeMillis();
    appendStringSB(100000);
    long end = System.currentTimeMillis();
    System.out.println(end-start);
}
    public static void appendStringSB(int n){
        StringBuilder sb = new StringBuilder();
        for(int i=1 ; i<=n ; i++){
            sb.append(i);
        }
   }
}