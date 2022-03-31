package week19.practical;

public abstract class Person implements Comparable<Person>{
    //common attributes of person class
    private String name;
    private String emailAddress;


    public Person(String name, String emailAddress) {
        this.name = name;
        this.emailAddress = emailAddress;
    }

    public abstract String display();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public int compareTo(Person o) {
        return this.getName().compareTo(o.getName());
    }

}
