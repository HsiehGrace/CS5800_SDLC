package Question3;

import java.util.ArrayList;

public class Course {
    private String courseName;
    private ArrayList<Instructor> instructor = new ArrayList<Instructor>();
    private ArrayList<Textbook> textbook = new ArrayList<Textbook>();

    public Course(){
        courseName = "";
    }
    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName() {
        return courseName;
    }

    public void addInstructor(String firstName, String lastName, String officeNumber) {
        instructor.add(new Instructor(firstName, lastName, officeNumber));
    }

    public void addTextbook(String title, String author, String publisher) {
        textbook.add(new Textbook(title, author, publisher));
    }

    public void printCourse()
    {
        System.out.println("Course Name: " + courseName);
        for(Instructor instructor : instructor){
            System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
            System.out.println("Office Number: " + instructor.getOfficeNumber());
        }
        for(Textbook textbook : textbook){
            System.out.println("Textbook: " + textbook.getTitle() + " by " + textbook.getAuthor());
        }
    }

}

class Instructor {
    private String firstName, lastName;
    private String officeNumber;

    public Instructor() {
        firstName = "";
        lastName = "";
        officeNumber = "";
    }

    public Instructor(String firstName, String lastName, String officeNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.officeNumber = officeNumber;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getOfficeNumber() {
        return officeNumber;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
}

class Textbook{
    private String title, author, publisher;

    // Constructor
    public Textbook(){
        title = "";
        author = "";
        publisher = "";
    }

    public Textbook(String title, String author, String publisher) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
    }

    // Getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getPublisher() {
        return publisher;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}