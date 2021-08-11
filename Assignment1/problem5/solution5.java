public class solution5 {
    public static void main(String[] args) {
        int x1 = 14, x2 = 6, x3 = 20, x4 = 9;
        System.out.printf("\nMinimum of %d, %d, %d, %d using ternary operators: %d", x1, x2, x3, x4, min_ter(x1, x2, x3, x4));
        System.out.printf("\nMaximum of %d, %d, %d, %d using ternary operators: %d", x1, x2, x3, x4, max_ter(x1, x2, x3, x4));
        System.out.printf("\nMinimum of %d, %d, %d, %d using if-else statements: %d", x1, x2, x3, x4, min_con(x1, x2, x3, x4));
        System.out.printf("\nMaximum of %d, %d, %d, %d using if-else statements: %d", x1, x2, x3, x4, max_con(x1, x2, x3, x4));
    }

    static int min_ter (int a, int b, int c, int d) {
        int min = a;
        min = min < b ? min : b;
        min = min < c ? min : c;
        min = min < d ? min : d;
        return min;
    }
    static int max_ter (int a, int b, int c, int d) {
        int max = a;
        max = max > b ? max : b;
        max = max > c ? max : c;
        max = max > d ? max : d;
        return max;
    }
    static int min_con(int a, int b, int c, int d) {
        if (a <= b && a <= c && a <= d) {
            return a;
        } else {
            if (b <= a && b <= c && b <= d) {
                return b;
            } else {
                if (c <= a && c <= b && c <= d) {
                    return c;
                } else {
                    return d;
                }
            }
        }
    }
    static int max_con(int a, int b, int c, int d) {
        if (a >= b && a >= c && a >= d) {
            return a;
        } else {
            if (b >= a && b >= c && b >= d) {
                return b;
            } else {
                if (c >= a && c >= b && c >= d) {
                    return c;
                } else {
                    return d;
                }
            }
        }
    }
}
