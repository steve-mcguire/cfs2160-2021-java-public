package week16;

public class Sphere extends  Circle{

    public Sphere() {
    }

    public Sphere(double radius, String colour) {
        super(radius, colour);
    }

    public double getVolume(){
        return .75 * 3.14 * (super.getRadius() * super.getRadius() * super.getRadius());
    }
}
