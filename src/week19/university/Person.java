package week19.university;

public abstract class Person {
    private String name, email;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public String getEmail(){
        return this.email;
    }

    public abstract String display();
}
