public class Rectangle {
    int height, width, area;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
        area = height*width;

        System.out.printf("Area of rectangle of height %d, and width %d is: %d\n", height,width, area);
    }

    public Rectangle() {
        this(1, 1);
    }

    public Rectangle(int size) {
        this(size, size);
    }

}
