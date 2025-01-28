package gr.aueb.cf.ch14.model;

/**
 * Java bean
 */
public class Teacher {
    private int id;
    private String firstName;
    private String lastName;

    public Teacher () {

    }

    public Teacher(int id, String firstName,String lastName) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
