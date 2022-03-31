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

        Student tony = new Student("Tony", "t.jenkins@hud.ac.uk", "Computing", "u1234567");
        tony.addModule(new Module("CFS2160", 70));
        tony.addModule(new Module("CFM2175", 100));
        uni.addPerson(tony);
        System.out.println("Tutors");
        System.out.println(uni.getPeopleDetailsByType(Tutor.class));
        System.out.println("Studetns");
        System.out.println(uni.getPeopleDetailsByType(Student.class));
        System.out.println("All");
        System.out.println(uni.getPeopleDetailsByType(Person.class));
    }
}
