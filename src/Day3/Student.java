package Day3;

public class Student extends User {

    private int[] courseIDs;

    public Student(int id, String firstName, String lastName, String email, String password, int[] courseID) {
        super(id, firstName, lastName, email, password);
        this.courseIDs = courseID;
    }

    public Student(){
        super();
    }

    public int[] getCourseIDs() {
        return courseIDs;
    }

    public void setCourseIDs(int[] courseIDs) {
        this.courseIDs = courseIDs;
    }
}
