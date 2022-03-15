package week18;

public class Volunteer {
    private int boxesDelivered;
    private String volunteerName;

    public Volunteer(int boxesDelivered, String volunteerName) {
        this.boxesDelivered = boxesDelivered;
        this.volunteerName = volunteerName;
    }

    public String getDetails(){
        double first50 = 50 * 0.15;
        double remaining = (boxesDelivered - 50) * 0.20;
        double total = remaining + first50;

        return volunteerName + ", has earned £" + total;
    }
}