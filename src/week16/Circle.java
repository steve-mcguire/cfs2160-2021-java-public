package week16;

public class Circle {
    private double radius;
    private String colour;

    public Circle(){}

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
        return "EXAMPLES.ClassCreationBasicsTest.Circle{" +
                "raduis=" + radius +
                ", colour='" + colour + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Circle bob = new Circle(100, "Bob");
        System.out.println(bob);
    }
}