package week18;

public class VolunteerTest {
    public static void main(String[] args) {
        Volunteer bob = new Volunteer(100, "Bob");
        Volunteer steve = new Volunteer(200, "Steve");

        System.out.println(bob.getDetails());
        System.out.println(steve.getDetails());
    }
}
