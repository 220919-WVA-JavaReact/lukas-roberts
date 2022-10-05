package com.revature.courses.service;

import com.revature.courses.dao.CourseDAO;
import com.revature.courses.dao.CourseDAOImpl;
import com.revature.courses.models.Course;

import java.util.Scanner;

public class CourseService {

    Scanner sc = new Scanner(System.in);
    CourseDAO cd = new CourseDAOImpl();

    public void createCourse() {
        System.out.println("Enter Course Number (e.g. MTH2048): ");
        String courseNum = sc.nextLine();
        System.out.println("Enter Course Title: ");
        String courseTitle = sc.nextLine();
        System.out.println("Enter Teacher Id: ");
        int teacherId = sc.nextInt();
        cd.createCourse(courseNum, courseTitle, teacherId);
    }

    public void assignCourse(int teacherId) {
        System.out.println("Enter Course Number (e.g. MTH2048): ");
        String courseNum = sc.nextLine();

        Course enroll = new Course(courseNum, teacherId);
        cd.updateCourse(enroll);
    }

}
