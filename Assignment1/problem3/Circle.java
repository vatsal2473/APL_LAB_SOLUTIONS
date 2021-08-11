public class Circle {
    double radius, area;

    public Circle(double radius) {
        this.radius = radius;
        double area = radius*radius*Math.PI;
        System.out.printf("Area of circle with radius %f is: %f\n", radius, area);
    }

    public Circle() {
        this(1);
    }
}
