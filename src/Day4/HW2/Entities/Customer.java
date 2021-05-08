package Day4.HW2.Entities;

import java.util.Date;

public class Customer {
    public int id;
    public String firstName, lastName;
    public Date date;
    public String nationalityID;

    public Customer(int id, String firstName, String lastName, Date date, String nationalityID) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.date = date;
        this.nationalityID = nationalityID;
    }
}
