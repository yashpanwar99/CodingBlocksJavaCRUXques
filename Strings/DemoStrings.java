// Strings are collection of many characters . String in java is immutable and are used to store a sequence of characters.

package Strings;

public class DemoStrings {
    public static void main(String[]args){
        String str1 = "Yash";

        // Length of string
        System.out.println(str1.length());

        // Finding the index of the character
        System.out.println(str1.charAt(2));
        System.out.println(str1.charAt(str1.length()-1));

        // If we want to access multiple characters
        System.out.println(str1.substring(1,3));
        System.out.println(str1.substring(1)); // if we don't give the end-index then it returns string till end.

        // String Concatination
        String str2 = "Panwar";
        String str3 = str1 + str2;
        System.out.println(str3);
        String str4 = str1.concat(str2);
        System.out.println(str4);

        // to find the index of characters in a string
        System.out.println(str1.indexOf("as",0));

        // If the entered string is not present in the main string then it will return -1.

        // String Demo Starts with
        String str = "Hello";
        System.out.println(str.startsWith("H"));
        System.out.println(str.startsWith("h"));



    }
}
