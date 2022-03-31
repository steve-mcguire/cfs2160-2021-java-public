package week19.practical;

public class Student extends Person{
    private String studentID;
    private String course;

    public Student(String name, String emailAddress, String studentID, String course) {
        super(name, emailAddress);
        this.studentID = studentID;
        this.course = course;
    }

    @Override
    public String display() {
        return "Student Details. name: " + super.getName() + ", email: " + super.getEmailAddress() + ", id: " + this.studentID + ", enrolled course: " + this.course;
    }


}
