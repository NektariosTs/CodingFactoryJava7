package gr.aueb.cf.ch12.model;

public class User {

    private int id;
    private String firstname;
    private String lastname;
    private String username;
    private String password;
    private boolean isActive;

    public User() {

    }

    public User(int id, boolean isActive, String password, String username, String lastname, String firstname) {
        this.id = id;
        this.isActive = isActive;
        this.password = password;
        this.username = username;
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
