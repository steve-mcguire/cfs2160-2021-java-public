package week19.university;

import java.util.ArrayList;

public class Student extends Person{
    private String course, studentID;
    private ArrayList<Module> modules = new ArrayList<>();

    public Student(String name, String email, String course, String studentID) {
        super(name, email);
        this.course = course;
        this.studentID = studentID;
    }

    public void addModule(Module module){
        this.modules.add(module);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    @Override
    public String display() {
        StringBuilder sb = new StringBuilder();

        String r = String.format("Name: %-15s | Email: %-20s | Course: %-15s | Student ID %-12s", super.getName(),
                super.getEmail(), this.getCourse(), this.getStudentID());

        sb.append(r);
        for(Module m : modules){
            sb.append("\n");
            sb.append(m.display());
        }
        //sb.append("\n");
        return sb.toString();
    }
}
