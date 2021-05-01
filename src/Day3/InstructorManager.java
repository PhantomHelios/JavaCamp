package Day3;

public class InstructorManager extends UserManager{

    public void addCourse(Instructor instructor, String courseName) {
        System.out.printf("%s named course, added by %s\n",courseName, instructor.getFirstName(), instructor.getLastName());
    }

    public void updateCourse(Instructor instructor, String courseName) {
        System.out.printf("%s named course, updated by %s\n",courseName, instructor.getFirstName(), instructor.getLastName());
    }

    public void deleteCourse(Instructor instructor, String courseName) {
        System.out.printf("%s named course, deleted by %s\n",courseName, instructor.getFirstName(), instructor.getLastName());
    }
}
