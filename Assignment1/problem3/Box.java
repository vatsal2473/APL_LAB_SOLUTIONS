
public class Box {
    int height, width, depth, volume;

    public Box(int height, int width, int depth) {
            this.height = height;
            this.width = width;
            this.depth = depth;
            volume = height*width*depth;
    
            System.out.printf("Volume of box with height %d, width %d, and depth %d is: %d\n",height, width, depth, volume);
        }

    public Box() {
            this(1, 1, 1);
        }

    public Box(int size) {
            this(size, size, size);
        }
}