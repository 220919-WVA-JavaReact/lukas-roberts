package com.revature.foundational_project.dao;

import com.revature.foundational_project.models.Request;

import java.util.LinkedList;
import java.util.List;

public class RequestDAOImpl implements RequestDAO {
    @Override
    public Request createRequest(int employeeId, double price, String description) {
        return new Request(employeeId, price, description);
    }

    @Override
    public LinkedList<Request> getAllRequests() {
        // maybe use LinkedList for first in first out for requests
        return null;
    }

    @Override
    public List<Request> getRequestsByEmployeeId(int id) {
        return null;
    }

    @Override
    public Request updateRequest() {
        return null;
    }


}
