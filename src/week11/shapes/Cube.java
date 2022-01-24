package week11.shapes;

public class Cube {
    private int width, height, depth;

    public Cube(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getVolume(){
        return height * width * depth;
    }
}
