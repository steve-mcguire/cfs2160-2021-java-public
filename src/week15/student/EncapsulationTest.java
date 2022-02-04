package week15.student;

import java.util.ArrayList;

public class EncapsulationTest {
    public static void main(String[] args) {
        ArrayList<Student> myStudents = new ArrayList<>();
        Student steve = new Student();
        Student oliver = new Student();
        Student rabia = new Student();
        Student gary = new Student();

        steve.setId(123456);
        steve.setName("Steve");
        oliver.setId(35454);
        oliver.setName("Oliver");
        rabia.setId(244);
        rabia.setName("Rabia");
        gary.setName("Gary");
        gary.setId(1234355);

        myStudents.add(steve);
        myStudents.add(oliver);
        myStudents.add(rabia);
        myStudents.add(gary);

        for(int x = 0; x < myStudents.size(); x++){
           System.out.println(myStudents.get(x).getName());
        }

        for(Student student : myStudents){
            System.out.println(student.getName() + " " + student.getId());
        }

    }
}
