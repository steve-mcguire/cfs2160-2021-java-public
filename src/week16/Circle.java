package week16;

public class Circle {
    private double radius;
    private String colour;

    public Circle() {
    }

    public Circle(double radius, String colour) {
        this.radius = radius;
        this.colour = colour;
    }

    public double getRadius(){
        return this.radius;
    }

    public double getArea(){
        return 3.14 * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "raduis=" + radius +
                ", colour='" + colour + '\'' +
                '}';
    }
}
