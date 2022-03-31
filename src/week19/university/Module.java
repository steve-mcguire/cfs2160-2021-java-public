package week19.university;

public class Module {
    private String name;
    private double grade;

    public Module(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public String display(){
        return String.format("%13s %-8s", this.name, this.grade);
    }
}
