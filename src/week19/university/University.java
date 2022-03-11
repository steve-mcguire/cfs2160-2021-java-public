package week19.university;

import java.util.ArrayList;

public class University {
    private ArrayList<Person> people = new ArrayList<>();

    public University() {
    }

    public void addPerson(Person p){
        this.people.add(p);
    }


    public String getAllStudents(){
        StringBuilder sb = new StringBuilder();
        for(Person p : people){
            if(p instanceof Student){
                sb.append(p.display());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public String getAllStaff(){
        StringBuilder sb = new StringBuilder();
        for(Person p : people){
            if(p instanceof Tutor){
                sb.append(p.display());
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public String getAllPeople(){
        StringBuilder sb = new StringBuilder();
        for(Person p : people){
            sb.append(p.display());
            sb.append("\n");
        }
        return sb.toString();
    }
}