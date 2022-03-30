package EXAMPLES.ClassCreationBasicsTest;

public class Circle {
    private int radius;
    private String colour;

    public Circle(int radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getArea(){
        double area = 0.14 * radius;

        return area;
    }

    @Override
    public String toString() {
        return "EXAMPLES.ClassCreationBasicsTest.Circle{" +
                "radius=" + radius +
                "area=" + getArea() +
                ", colour='" + colour + '\'' +
                '}';
    }
}
