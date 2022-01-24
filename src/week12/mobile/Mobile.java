package week12.mobile;

public class Mobile {
    private String model;
    private int numberOfSims;
    private double memory;
    private boolean hasCamera;

    public Mobile(String model, int numberOfSims, double memory, boolean hasCamera) {
        this.model = model;
        this.numberOfSims = numberOfSims;
        this.memory = memory;
        this.hasCamera = hasCamera;
    }

    public String getModel() {
        return model;
    }

    public int getNumberOfSims() {
        return numberOfSims;
    }

    public double getMemory() {
        return memory;
    }

    public boolean getHasCamera() {
        return hasCamera;
    }
}
