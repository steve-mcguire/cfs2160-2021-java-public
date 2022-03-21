package week21studysession;

public class StudentMain {
    public static void main(String[] args) {
        Module bob = new Module("Bob", 100);
        Module steve = new Module("Steve", 110);
        Student student = new Student();
        student.addModule(bob);
        student.addModule(steve);

    }
}
