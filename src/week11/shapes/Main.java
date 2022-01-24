package week11.shapes;


public class Main {
    public static void main(String[] args) {
        //create an instance of rectangle,
        // by passing int for height and width into its constructor
        Rectangle r1 = new Rectangle(10, 7);
        //call hte getArea method of Rectangle byt accessing the method of the instance.
        System.out.println("Rectangle 1 area is: " + r1.getArea());

        Rectangle r2 = new Rectangle(4,6);
        System.out.println("Rectangle 2 area is: " + r2.getArea());

        Cube c1 = new Cube(29, 5, 7);
        System.out.println("Cube 1 volume is: " + c1.getVolume());

        Cube c2 = new Cube(6,3,9);
        System.out.println("Cube 1 volume is: " + c2.getVolume());
    }
}