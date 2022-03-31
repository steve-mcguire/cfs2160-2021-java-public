package week15.support;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> moduleTutors = new ArrayList<>();

        moduleTutors.add("Rabia");
        moduleTutors.add("Steve");
        moduleTutors.add("Ayub");
        moduleTutors.add("Mohamed");
        moduleTutors.add("Muhammad");
        moduleTutors.add("Mark");

        for(String tutor : moduleTutors){
            System.out.println(tutor.toUpperCase());
        }
    }
}
