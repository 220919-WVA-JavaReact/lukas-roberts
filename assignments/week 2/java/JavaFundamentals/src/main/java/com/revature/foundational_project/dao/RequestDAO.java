package com.revature.foundational_project.dao;


import com.revature.foundational_project.models.Request;

import java.util.LinkedList;
import java.util.List;

public interface RequestDAO {
    Request createRequest(int employeeId, double price, String description);

    LinkedList<Request> getAllRequests();

    List<Request> getRequestsByEmployeeId(int id);

    Request updateRequest();
}
