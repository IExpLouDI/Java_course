package methods;

public class OverloadSumNumber {
    static int a = 2;
    static int b = 3;
    static int c = 4;
    static double d = 2.3;
    static double f = 2.44;
    static double h = 54.33;

    public static void main(String[] args) {
        var s1 = getSum(a, b);
        var s2 = getSum(a, b, c);
        var s3 = getSum(d, f, h);
        System.out.println("Overload results");
        System.out.println("s1: " + s1 + "\n" +
                "s2: " + s2 + "\n" +
                "s3: " + s3);
    }
    static int getSum(int a, int b){
        return a + b;
    }
    static int getSum(int a, int b, int c){
        return a + b + c;
    }
    static double getSum(double a, double b, double c){
        return a + b + c;
    }
}
