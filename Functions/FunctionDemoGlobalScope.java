package Functions;

public class FunctionDemoGlobalScope {
    public static int val = 20;        // Global Variable
    public static void main(String[]args){
        System.out.println(val);
        int one = 10;
        int val = 200;
        System.out.println(val);
        System.out.println(FunctionDemoGlobalScope.val);
        int k = DemoGlobalScope(one);
        System.out.println(k);

    }
    public static int DemoGlobalScope(int one){
        int sum = one + val;
        return sum;
    }
}
