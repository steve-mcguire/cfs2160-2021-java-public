package week11.shapes;

public class Rectangle {
    //declare the attributes
    private int height, width;

    /**
     * Constructor for rectangle
     * Pass int values for attributes for rectangle, height, width
     * @param height the height of rectangle
     * @param width the width of rectangle
     */
    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    /**
     * Get the area of the rectangle
     * @return int, the area of rectangle
     */
    public int getArea(){
        return height * width;
    }
}
