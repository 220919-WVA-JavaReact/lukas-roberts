package com.revature.foundational_project.dao;

import com.revature.foundational_project.models.Employee;

public interface EmployeeDAO {
    Employee getEmployeeByEmail(String email);

    Employee createEmployee(String first, String last, String email, String password, boolean manager);
}
