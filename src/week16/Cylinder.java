package week16;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, String colour, double height){
        super(radius, colour);
        this.height = height;
    }

    public double getVolume(){
        return this.height * super.getArea();
    }
}
