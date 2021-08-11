public class solution6 {
    public static void main(String[] args) {
        var z = 8;
        System.out.println("\nValue of z = " + z);
        var a = z++ + ++z;
        System.out.println("Value of a = z++ + ++z = " + a);
        System.out.println("\nValue of z = " + z);
        var b = z-- + --z;
        System.out.println("Value of b = z-- + --z = " + b);
        System.out.println("\nValue of z = " + z);
        var c = z++;
        System.out.println("Value of c = z++ = " + c);
        System.out.println("\nValue of z = " + z);
        var d = ++z;
        System.out.println("Value of d = ++z = " + d);
        System.out.println("\nValue of z = " + z);
        var e = z--;
        System.out.println("Value of e = z-- = " + e);
        System.out.println("\nValue of z = " + z);
        var f = --z;
        System.out.println("Value of f = --z = " + f);
        System.out.println("\nValue of z = " + z);
    }
}
