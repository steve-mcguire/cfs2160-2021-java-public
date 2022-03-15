package week19.practical;

import java.util.ArrayList;
import java.util.Collections;

public class University {
    private ArrayList<Person> uniMembers;

    public University() {
        this.uniMembers = new ArrayList<>();
    }

    public void addMember(Person person){
        this.uniMembers.add(person);
    }

    public void sortMembers(){
        Collections.sort(uniMembers);
    }

    public String getAllMemberDetails(){
        StringBuilder sb = new StringBuilder();

        for(Person p : uniMembers){
            sb.append(p.display());
            sb.append("\n");
        }

        return sb.toString();
    }

    public String getAllStudentDetails(){
        StringBuilder sb = new StringBuilder();

        for(Person p : uniMembers){
            if(p instanceof Student){
                sb.append(p.display());
                sb.append("\n");
            }

        }

        return sb.toString();
    }
}
