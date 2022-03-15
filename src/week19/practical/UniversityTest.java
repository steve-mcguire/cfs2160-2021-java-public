package week19.practical;

public class UniversityTest {
    public static void main(String[] args) {
        University uni = new University();
        Student steve = new Student("Steve", "s.mcguire@hud.ac.uk", "u0670824", "Programming");
        Tutor george = new Tutor("George", "g.bargiannis@hud.ac.uk", "SJ5/05", "CFS2160");
        uni.addMember(steve);
        uni.addMember(george);


        System.out.println(uni.getAllMemberDetails());
        uni.sortMembers();
        System.out.println(uni.getAllMemberDetails());
        System.out.println(uni.getAllStudentDetails());
    }
}
