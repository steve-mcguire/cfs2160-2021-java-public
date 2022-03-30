package EXAMPLES.ArrayListBasicsDemo;

import java.util.ArrayList;

public class StudentTest {
    //ArrayList to store collection of students
    private ArrayList<Student> studentsList = new ArrayList<>();

    //add a student to the ArrayList
    public void addStudent(Student s){
        this.studentsList.add(s);
    }

    //method loop the list, sum the total ages and get return the average age of the class
    private double getAverageAge(){
        double total = 0;
        for(Student s : this.studentsList){
            total += s.getAge();
        }
        return total / this.studentsList.size();
    }

    public static void main(String[] args) {
        StudentTest st = new StudentTest();
        Student steve = new Student("Steve", 43);
        Student ayub = new Student("Ayub", 21);
        Student rabia = new Student("Rabia", 28);

        st.addStudent(steve);
        st.addStudent(ayub);
        st.addStudent(rabia);
        System.out.println(st.getAverageAge());
    }
}
