package week16;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1.getArea() + " " + c1.getRadius());

        Circle c2 = new Circle(10, "Red");
        System.out.println(c2.getArea() + " " + c2.getRadius());

        Cylinder cy1 = new Cylinder(10, "Blue", 15);
        System.out.println(cy1.getVolume());

        Sphere s1 = new Sphere(20, "Green");
        System.out.println(s1.getVolume());

        Square sq1 = new Square(10);
        System.out.println(sq1.getArea());

        Cube cube1 = new Cube(10);
        System.out.println(cube1.getVolume());
    }
}
