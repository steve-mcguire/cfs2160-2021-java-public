package week12.student;

public class FindHighestMark {

    public static void main(String[] args) {
        Student mia = new Student("Mia", 72);
        Student sally = new Student("Sally", 88);
        Student josh = new Student("Josh", 89);

        FindHighestMark fhm = new FindHighestMark();
        Student result = fhm.getHighestMarkStudent(mia, sally, josh);
        System.out.println(result.getName() + " has the highest mark.");
    }

    public Student getHighestMarkStudent(Student s1, Student s2, Student s3){
        if(s1.getMark() > s2.getMark() && s1.getMark() > s3.getMark()){
            return s1;
        }else if(s2.getMark() > s1.getMark() && s2.getMark() > s3.getMark()){
            return s2;
        }
        else if(s3.getMark() > s1.getMark() && s3.getMark() > s2.getMark()){
            return s3;
        }else{
            return null;
        }
    }
}
