package week18;


public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(10, "Green");
        Circle c2 = new Circle(20, "Red");
        Circle c3 = new Circle(100, "Blue");

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println(c3.getArea());
        double a1 = c1.getArea();
        System.out.println(a1);
        System.out.println(c2.getRadius());
        System.out.println(c3.getRadius());
    }
}
