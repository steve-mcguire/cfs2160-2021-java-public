package week12.mobile;

public class MobileTester {
    public static void main(String[] args) {
        Mobile mobile = new Mobile("Samsung Wave", 2, 1024.0, true);

        System.out.print(mobile.getModel() + " has " + mobile.getNumberOfSims() + " sims and has a memory of "
                + mobile.getMemory() + " MB.");
        System.out.println(mobile.getHasCamera() ? " It has a camera." : " It has no camera.");

    }
}
