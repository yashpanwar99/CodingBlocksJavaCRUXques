package Strings;
import java.lang.StringBuilder;
public class sTringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);
        // Appending
        sb.append("Yash");
        System.out.println(sb);

        //Length
        System.out.println(sb.length());

        // charAt
        System.out.println(sb.charAt(2));

        // insert
        System.out.println(sb.insert(4,"Panwar"));

        // delete
        System.out.println(sb.deleteCharAt(0));

        // String Builder to String Conversion
        String s = sb.toString();
    }
}