public class Main {
    public static void main(String[] args) {
        int x=10,y=20,z=30,a=40;
        System.out.print("\nAddition\n");
        System.out.print(x+" + "+y+" = ");
        new Addition(x,y);
        System.out.print(x+" + "+y+" + "+z+" = ");
        new Addition(x,y,z);
        System.out.print(x+" + "+y+" + "+z+" + "+a+" = ");
        new Addition(x, y, z, a);
    }
}
