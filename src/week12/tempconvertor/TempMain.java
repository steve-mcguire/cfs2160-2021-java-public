package week12.tempconvertor;

public class TempMain {
    public static void main(String[] args) {
        TempMain tm = new TempMain();
        ConvertTemp ct = new ConvertTemp(35.0, 0.0);

        tm.convert(ct);
        System.out.println(ct);

    }

    public void convert(ConvertTemp ct){
        ct.setF(ct.getC() * 9/5 + 32);
    }
}
