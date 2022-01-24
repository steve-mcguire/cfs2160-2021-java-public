package week13.support;

import java.util.ArrayList;

public class Student {
    private String studentName, studentID;
    private ArrayList<Module> modules = new ArrayList<>();
    //score = ["steve", 6, True, 505.4]

    public Student(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public void addModule(Module module){
        modules.add(module);
    }

    public double calculateAverageScore(){
        System.out.println("List contains " + modules.size());
        double totalScore = 0;
        for (Module module : modules){
            totalScore += module.getScore();
        }
        return totalScore / modules.size();
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentID='" + studentID + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student steve = new Student("Steve", "u0670824");
        System.out.println(steve.toString());


        Module cfs2160 = new Module("Software Design and Development", "CFS2160",
                "Rabia Jilani");
        cfs2160.setScore(100);
        steve.addModule(cfs2160);

        Module cfm2175 = new Module("Computing Science and Mathematics", "CFM2175",
                "Diane Kitchin");
        cfm2175.setScore(78);
        steve.addModule(cfm2175);

        Module cfs2101 = new Module("Computer Organisation and Architecture", "CFS2101",
                "Louie Qin");
        cfs2101.setScore(90);
        steve.addModule(cfs2101);

        Module cfs2102 = new Module("Network Fundamentals", "CFS2102",
                "James Dyer");
        cfs2102.setScore(50);
        steve.addModule(cfs2102);

        Module cfm2176 = new Module("Project 1", "CFM2175",
                "Diane Kitchin");
        cfm2176.setScore(58);
        steve.addModule(cfm2176);

        System.out.println(steve.calculateAverageScore());

    }
}
