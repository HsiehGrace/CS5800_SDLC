package Question3;

public class CourseDriver {
    public static void main(String[] args) {
        Course thisCourse = new Course("Advanced Software Engineering");
        thisCourse.addInstructor("Nima","Davarpanah","3-2636");
        thisCourse.addTextbook("Clean Code: A Handbook of Agile Software Craftsmanship",
                "Robert Cecil Martin", "Pearson Education");
        thisCourse.printCourse();

        thisCourse.addInstructor("Jane","Doe","4-1234");
        thisCourse.addTextbook("GenericTitle","Writer","Company");
        thisCourse.printCourse();
    }
}
