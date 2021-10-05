package Basics;

public class DeclarationInitialization {
    public static void main(String[] args){
        int a;            // Declaration
        a = 10;           // Initialization

        // In java we can reinitialize a variable but can't redeclare it
        System.out.println(a);
        a = 20;
        System.out.println(a);
    }
}
