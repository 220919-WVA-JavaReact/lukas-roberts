package com.revature.foundational_project.models;

import java.util.Objects;

public class Request {
    // id reference
    private int id;
    private int employeeId;
    private double price;
    private String description;
    private String approvalStatus = "Pending";
    private boolean completed = false;

    public Request( int employeeId, double price, String description) {
        this.employeeId = employeeId;
        this.price = price;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    @Override
    public String toString() {
        return "ReimbursementRequest{" +
                "employeeId=" + employeeId +
                ", price=" + price +
                ", description='" + description + '\'' +
                ", approved=" + approvalStatus +
                ", completed=" + completed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request that = (Request) o;
        return Double.compare(that.price, price) == 0 && approvalStatus == that.approvalStatus && completed == that.completed && description.equals(that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, description, approvalStatus, completed);
    }
}
