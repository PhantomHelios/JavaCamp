package Day3;

public class Day3Test {
    public static void main(String[] args) {
        Instructor instructor = new Instructor(1, "Engin", "Demirog", "engin@demirog.com", "123456",
                "Microsoft Certified Trainer (MCT)");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.add(instructor);
        instructorManager.addCourse(instructor, "(JAVA + REACT)");

        int[] courseIds = {1,2};
        Student student = new Student(1, "İsa", "Karahan", "helloworld@gmail.com", "asqsad12", courseIds);
        StudentManager studentManager = new StudentManager();
        studentManager.add(student);
        studentManager.joinCourse(student, 3);
        studentManager.doHomework(student, 4);
    }
}
