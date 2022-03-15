package week16;

public class Cube extends Square{

    public Cube(int edge) {
        super(edge);
    }

    public int getVolume(){
        return super.getEdge() * super.getEdge() * super.getEdge();
    }
}
