package week23;

public class Tutor {
    private String givenName, surname, email, room;

    public Tutor(String givenName, String surname, String email, String room) {
        this.givenName = givenName;
        this.surname = surname;
        this.email = email;
        this.room = room;
    }

    public Tutor() {
    }

    public String getGivenName() {
        return givenName;
    }

    public void setGivenName(String givenName) {
        this.givenName = givenName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "givenName='" + givenName + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", room='" + room + '\'' +
                '}';
    }
}
