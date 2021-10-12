package Functions;

public class FunctionDemoReturn {
    public static void main(String[]args){
        int sum = addReturn(10 , 20);
        System.out.println("Sum is " + sum);
    }
    public static int addReturn(int m , int n){
        //return m+n;
        int sum = m + n;
        return sum;
    }
}
