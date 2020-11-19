package student;
public class Name {
    String firstname;
    String lastname;
    public Name(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Name{ First Name: " +
                firstname +
                ", Last Name: " +
                lastname +
                " }";
    }
}
