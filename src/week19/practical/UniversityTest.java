package week19.practical;

public class UniversityTest {
    public static void main(String[] args) {
        University uni = new University();
        Student steve = new Student("Steve", "s.mcguire@hud.ac.uk", "u0670824", "Programming");
        Tutor george = new Tutor("George", "g.bargiannis@hud.ac.uk", "SJ5/05", "CFS2160");
        Student nathan = new Student("Nathan", "nathan@hud.ac.uk", "u123456", "cfs2160");
        Student nathan2 = new Student("Nathan", "nathan@hud.ac.uk", "u123456", "cfs2160");
        uni.addMember(steve);
        uni.addMember(george);
        uni.addMember(nathan);
        uni.addMember(nathan2);

        System.out.println(steve.display());
        System.out.println(george.display());
        System.out.println(nathan.display());

        //int total = 0;
        //total += steve.getBoxes();
        //total +=


        System.out.println(uni.getAllMemberDetails());
        //uni.sortMembers();
        //System.out.println(uni.getAllMemberDetails());
        //System.out.println(uni.getAllStudentDetails());
    }
}
