package week12.tempconvertor;

public class ConvertTemp {

    private double c, f;

    public ConvertTemp(double c, double f) {
        this.c = c;
        this.f = f;
    }

    public double getC() {
        return c;
    }

    public double getF() {
        return f;
    }

    public void setC(double c) {
        this.c = c;
    }

    public void setF(double f) {
        this.f = f;
    }

    @Override
    public String toString(){
        return "F: " + getF() + ", C: " + getC();
    }
}
