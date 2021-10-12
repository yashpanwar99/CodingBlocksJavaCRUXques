package Functions;

public class FunctionDemoBlockScope {
    public static void maim(String[]args){
        int one = 10;
        int two = 20;
        if(one < two){
            System.out.println("Hello");
            int three = 30;
        }
        // System.out.println(three);
    }
}

// Variable Three is inside the scope of if loop & is not available outside it.