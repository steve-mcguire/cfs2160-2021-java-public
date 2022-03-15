package week19.university;

public class Tutor extends Person {
    private String taughtCourse, office;

    public Tutor(String name, String email, String taughtCourse, String office) {
        super(name, email);
        this.taughtCourse = taughtCourse;
        this.office = office;
    }

    public String getTaughtCourse() {
        return taughtCourse;
    }

    public void setTaughtCourse(String taughtCourse) {
        this.taughtCourse = taughtCourse;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public String display() {
        return this.getName() + " " +
                this.getEmail() + " " +
                this.getOffice() + " " +
                this.getTaughtCourse();
    }
}
