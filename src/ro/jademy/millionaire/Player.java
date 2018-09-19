package ro.jademy.millionaire;

public class Player {
   private String firstname;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Player (String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;

    }
}
