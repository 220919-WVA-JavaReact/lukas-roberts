package com.revature.foundational_project;

import com.revature.foundational_project.models.Employee;
import com.revature.foundational_project.service.EmployeeService;
import com.revature.foundational_project.service.RequestService;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        EmployeeService es = new EmployeeService();
        RequestService rs = new RequestService();
        System.out.println("Press 1 to login. Press 2 to register.");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        sc.nextLine();
        Employee loggedInEmployee = null;
        if (choice == 1) {
            loggedInEmployee = es.login();
        } else if (choice == 2) {
            loggedInEmployee = es.register();
        }

        if (loggedInEmployee != null) {
            if (loggedInEmployee.isManager()) {
                System.out.println("Press 1 to view a specific request(request id required). Press 2 to view all pending requests.");
                System.out.println("Press 3 to update a request.");
            } else {
                System.out.println("Press 1 to create a request. Press 2 to view your pending requests.");
                choice = sc.nextInt();
                if (choice == 1) {
                    //rs.createRequest(loggedInEmployee.getId());
                    System.out.println(rs.createRequest(loggedInEmployee.getId()));
                }
            }
        }
    }
}
