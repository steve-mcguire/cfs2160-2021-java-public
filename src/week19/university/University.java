package week19.university;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class University {
    private ArrayList<Person> people = new ArrayList<>();

    public University() {
    }

    public void addPerson(Person p){
        this.people.add(p);
    }


    /*public String getAllStudents(){
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
    }*/

    public <T> String getPeopleDetailsByType(Class<T> className) throws Exception {
        StringBuilder sb = new StringBuilder();
        List<Person> peeps;
        if(className.equals(Person.class)){
            peeps = people;
        }else{
            peeps = people.stream().filter(p -> p.getClass().equals(className)).collect(Collectors.toList());
        }
        if(peeps.size() == 0){
          throw new Exception("No members found") ;
        }
        for(Person p : peeps){
            sb.append(p.display());
            sb.append("\n");
        }
        return sb.toString();
    }
}