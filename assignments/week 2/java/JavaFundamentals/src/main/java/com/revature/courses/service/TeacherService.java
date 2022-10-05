package com.revature.courses.service;

import com.revature.courses.dao.TeacherDAO;
import com.revature.courses.dao.TeacherDAOImpl;
import com.revature.courses.models.Teacher;

import java.util.Scanner;

public class TeacherService {
    TeacherDAO td = new TeacherDAOImpl();
    Scanner sc = new Scanner(System.in);
    public Teacher login() {
        System.out.println("Please enter your username");
        String username = sc.nextLine();
        System.out.println("Please enter your password");
        String password = sc.nextLine();
        System.out.println("Username: " + username + ", password: " + password);
        Teacher teach = td.getByUsername(username);
        if (password.equals(teach.getPassword())) {
            System.out.println("Congratulations after everything you have been logged in!");
            System.out.println(teach);
            return teach;
        } else {
            System.out.println("Invalid Login");
            return null;
        }
    }

    public Teacher register() {
        System.out.println("Please enter your first name");
        String first = sc.nextLine();
        System.out.println("Please enter your last name");
        String last = sc.nextLine();
        System.out.println("Please enter a username");
        String username = sc.nextLine();
        System.out.println("Please enter a password");
        String password = sc.nextLine();
        Teacher teacher = td.createTeacher(first, last, username, password);
        return teacher;
    }
}
