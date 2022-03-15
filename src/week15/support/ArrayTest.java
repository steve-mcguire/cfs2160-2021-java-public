package week15.support;

public class ArrayTest {
    public static void main(String[] args) {
        //Declare and create an array of Strings
        String[] moduleTutors = new String[7];
        //add some values to it using indexing
        moduleTutors[0] = "Rabia";
        moduleTutors[1] = "Steve";
        moduleTutors[2] = "Ayub";
        moduleTutors[4] = "Mohamed";
        moduleTutors[5] = "Muhammad";
        moduleTutors[6] = "Mark";

        //loop through the list and print each tutor in turn
        for(String tutor : moduleTutors){
            System.out.println(tutor);
        }
    }
}
