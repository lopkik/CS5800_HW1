package com.Aggregation.Course;

public class Course {
    private String name;
    private Instructor instructor;
    private Textbook textbook;

    public Course(String name, Instructor instructor, Textbook textbook) {
        this.name = name;
        this.instructor = instructor;
        this.textbook = textbook;
    }

    public void printCourse() {
        System.out.println(this.name +
                " taught by " + this.instructor.getFirstName() + " " + this.instructor.getLastName() +
                " using \"" + this.textbook.getTitle() + "\" by " + this.textbook.getAuthor()
        );
    }
}
