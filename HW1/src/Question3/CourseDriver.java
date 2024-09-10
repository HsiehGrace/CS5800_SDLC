package Question3;
import Question3.Course;


public class CourseDriver {
    public static void main(String[] args) {
        Course thisCourse = new Course("Advanced Software Engineering");
        thisCourse.addInstructor("Nima","Davarpanah","3-2636");
        thisCourse.addTextbook("Clean Code", "test", "someone");
        thisCourse.printCourse();
    }
}
