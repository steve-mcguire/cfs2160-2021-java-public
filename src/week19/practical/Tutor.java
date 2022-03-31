package week19.practical;

public class Tutor extends Person {
    private String officeNumber;
    private String moduleTaught;

    public Tutor(String name, String emailAddress, String officeNumber, String moduleTaught) {
        super(name, emailAddress);
        this.officeNumber = officeNumber;
        this.moduleTaught = moduleTaught;
    }

    @Override
    public String display() {
        return "Tutor Details. name: " + super.getName() + ", email: " + super.getEmailAddress() + ", office: " + this.officeNumber + ", teaches on: " + this.moduleTaught;
    }

}
