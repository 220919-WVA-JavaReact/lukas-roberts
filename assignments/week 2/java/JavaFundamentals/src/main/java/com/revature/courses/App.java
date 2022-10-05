package com.revature.courses;

import com.revature.courses.models.Teacher;
import com.revature.courses.service.CourseService;
import com.revature.courses.service.TeacherService;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        TeacherService ts = new TeacherService();
        CourseService cs = new CourseService();
        System.out.println("Press 1 to login. Press 2 to register");
        Scanner sc = new Scanner(System.in);

        int choice = sc.nextInt();
        sc.nextLine();
        Teacher loggedInTeacher = null;

        if (choice == 1) {
            loggedInTeacher = ts.login();
        } else if (choice == 2) {
            loggedInTeacher = ts.register();
        }

        if (loggedInTeacher != null) {
            System.out.println("Press 1 to create a course. Press 2 to enroll to teach a course.");
            System.out.println("Press 3 to view all courses. Press 4 to view your courses.");
            int subChoice = sc.nextInt();
            switch (subChoice) {
                case 1:
                    cs.createCourse();
                    break;
                case 2:
                    cs.assignCourse(loggedInTeacher.getTeacherId());
                    break;
                case 3:
                    //cs.getAllCourses();
                    break;
                case 4:
                    //cs.getMyCourses();
                    break;
                default:
                    System.out.println("Invalid input.");
                    break;
            }
        }
    }
}
