package com.revature.foundational_project.service;

import com.revature.foundational_project.dao.RequestDAO;
import com.revature.foundational_project.dao.RequestDAOImpl;
import com.revature.foundational_project.models.Request;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RequestService {
    Scanner sc = new Scanner(System.in);
    RequestDAO rd = new RequestDAOImpl();

    public Request createRequest(int employeeId) {
        System.out.println("Enter an amount for reimbursement.");
        double price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Please describe the reason for your request.");
        String description = sc.nextLine();
        Request request = rd.createRequest(employeeId, price, description);
        request.setEmployeeId(employeeId);
        return request;
    }

    public Request updateRequest() {
        return null;
    }

    public LinkedList<Request> getAllRequests() {
        return null;
    }

    public List<Request> getRequestsByEmployeeId(int employeeId) {
        return null;
    }

}
