package com.Aggregation;

import com.Aggregation.Course.Course;
import com.Aggregation.Course.Instructor;
import com.Aggregation.Course.Textbook;

public class CourseDriver {
    public static void main(String[] args) {
        Instructor prof1 = new Instructor("Nima", "Davarpanah", "3-2636");
        Textbook text1 = new Textbook("Clean Code", "Robert Cecil Martin", "Pearson");
        Course cs5800 = new Course("CS5800", prof1, text1);
        cs5800.printCourse();

        Instructor prof2 = new Instructor("Peculiar", "Python", "2-4125");
        Textbook text2 = new Textbook("Python Programming for Perusing Pedestrians", "Peculiar Python", "Prep Publishing");
        Course csPPPP = new Course("CSPPPP", prof2, text2);
        csPPPP.printCourse();
    }
}
