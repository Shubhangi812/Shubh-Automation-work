package Edusmart_app;

import java.util.ArrayList;
import java.util.List;

// Abstract class: User
abstract class User {
    protected String name;
    protected String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public abstract void showMenu();
}

// Course class
class Course {
    private String title;
    private String description;
    private Instructor instructor;

    public Course(String title, String description, Instructor instructor) {
        this.title = title;
        this.description = description;
        this.instructor = instructor;
    }

    public String getTitle() {
        return title;
    }

    public void showCourseDetails() {
        System.out.println("Course: " + title);
        System.out.println("Description: " + description);
        System.out.println("Instructor: " + instructor.name);
    }
}

//  Student class
class Student extends User {
    private List<Course> enrolledCourses;

    public Student(String name, String email) {
        super(name, email);
        this.enrolledCourses = new ArrayList<>();
    }

    public void enrollInCourse(Course course) {
        enrolledCourses.add(course);
        System.out.println(name + " enrolled in " + course.getTitle());
    }

    public void showMenu() {
        System.out.println("\nStudent Dashboard for " + name);
        System.out.println("1. View Courses\n2. Enroll in Course\n");
    }
}

// Instructor class
class Instructor extends User {
    private List<Course> createdCourses;

    public Instructor(String name, String email) {
        super(name, email);
        this.createdCourses = new ArrayList<>();
    }

    public Course createCourse(String title, String description) {
        Course course = new Course(title, description, this);
        createdCourses.add(course);
        System.out.println("Course '" + title + "' created by " + name);
        return course;
    }

    public void showMenu() {
        System.out.println("\nInstructor Dashboard for " + name);
        System.out.println("1. Create Course\n2. Manage Courses\n");
    }
}

// Admin class
class Admin extends User {
    public Admin(String name, String email) {
        super(name, email);
    }

    public void manageSystem() {
        System.out.println(name + " is managing system settings and users.");
    }

  
    public void showMenu() {
        System.out.println("\nAdmin Panel for " + name);
        System.out.println("1. Manage Users\n2. System Settings\n");
    }
}

// Main class
public class EduSmartApp {
    public static void main(String[] args) {
        // Creating users
        Student student = new Student("Shubh", "Shubh@example.com");
        Instructor instructor = new Instructor("Sanket P", "Sanketp@gmail.com");
        Admin admin = new Admin("System Admin", "admin@edusmart.com");

        // Admin actions
        admin.showMenu();
        admin.manageSystem();

        // Instructor creates course
        instructor.showMenu();
        Course javaCourse = instructor.createCourse("Java Course", "Full Java programe ");

        // Student enrolls
        student.showMenu();
        student.enrollInCourse(javaCourse);

        // Display course details
        System.out.println("\n--- Course Details ---");
        javaCourse.showCourseDetails();
    }
}
