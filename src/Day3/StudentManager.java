package Day3;

public class StudentManager extends UserManager {
    public void doHomework(Student student, int lessonId) {
        System.out.printf("Homework is done. studentId: %d, lessonId: %d\n", student.getId(), lessonId);
    }

    public void joinCourse(Student student, int courseId) {
        System.out.printf("Joined to the course. studentId: %d, lessonId: %d\n", student.getId(), courseId);
    }
}
