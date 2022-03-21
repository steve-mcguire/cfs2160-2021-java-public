package week21studysession;

import java.util.ArrayList;

public class Student {
    private ArrayList<Module> scores = new ArrayList<>();

    public Student() {}

    public void addModule(Module m){
        scores.add(m);
    }

    public void printModules(){

    }
}
