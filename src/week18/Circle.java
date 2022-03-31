package week18;

public class Circle {
    private int radius;
    private String colour;

    public Circle(int radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getArea(){
        return 3.14 * radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public String toString() {
        return "EXAMPLES.ClassCreationBasicsTest.Circle{" +
                "radius=" + radius +
                ", colour='" + colour + '\'' +
                '}';
    }
}