package Day3;

public class Instructor extends User {
    private String resume;

    public Instructor(int id, String firstName, String lastName, String email, String password, String resume) {
        super(id, firstName, lastName, email, password);
        this.resume = resume;
    }

    public Instructor(){
        super();
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }
}
