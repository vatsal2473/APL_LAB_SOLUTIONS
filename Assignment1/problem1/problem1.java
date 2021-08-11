public class problem1 {
    static int addition(int x, int y) {
        return x + y;
    }
    static int subtraction(int x, int y) {
        return x - y;
    }
    static int multiplication(int x, int y) {
        return x * y;
    }
    static double division(double x, double y) {
        return x / y;
    }
    static int modulus(int x, int y) {
        return x % y;
    }

    static boolean and(boolean a, boolean b) {
        return a && b;
    }
    static boolean or(boolean a, boolean b) {
        return a || b;
    }
    static boolean not(boolean a) {
        return !a;
    }
    
    public static void main(String[] args) {
        int x = 27, y = 5;
        System.out.println("\nArithmetic Operators\n");
        System.out.println(x + " + " + y + " = " + addition(x, y));
        System.out.println(x + " - " + y + " = " + subtraction(x, y));
        System.out.println(x + " * " + y + " = " + multiplication(x, y));
        System.out.println(x + " / " + y + " = " + division(x, y));
        System.out.println(x + " % " + y + " = " + modulus(x, y));
        
        boolean x1 = true, y1 = false;
        System.out.println("\nLogical Operators\n");
        System.out.println(x1 + " and " + y1 + " = " + and(x1, y1));
        System.out.println(x1 + " or " + y1 + " = " + or(x1, y1));
        System.out.println("not " + x1 + " = " + not(x1));
    }
}