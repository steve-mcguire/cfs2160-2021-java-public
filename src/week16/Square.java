package week16;

public class Square {
    private int edge;

    public Square(int edge) {
        this.edge = edge;
    }

    public int getEdge(){
        return this.edge;
    }

    public int getArea(){
        return edge * edge;
    }
}
