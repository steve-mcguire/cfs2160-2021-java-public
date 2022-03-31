package week19.university;

public class uniTest {
    public static void main(String[] args) {
        University uni = new University();
        Tutor steve = new Tutor("Steve", "s.mcguire@hud.ac.uk", "CFS2160", "SJ3/07");
        uni.addPerson(steve);

        Student rabia = new Student("Rabia", "r.jilani@hud.ac.uk", "Computing", "u1234567");
        rabia.addModule(new Module("CFS2160", 100));
        rabia.addModule(new Module("CFM2175", 95));
        uni.addPerson(rabia);

        Student tony = new Student("Rabia", "r.jilani@hud.ac.uk", "Computing", "u1234567");
        tony.addModule(new Module("CFS2160", 70));
        tony.addModule(new Module("CFM2175", 100));
        uni.addPerson(tony);

        System.out.println("All uni members");
        System.out.println(uni.getAllPeople());
        System.out.println("All uni staff");
        System.out.println(uni.getAllStaff());
        System.out.println("All uni students");
        System.out.println(uni.getAllStudents());
    }
}
