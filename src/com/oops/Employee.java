package com.oops;

public class Employee {
    // Private fields
    private String employeeName;
    private double salary;
    private String department;

    // Constructor
    public Employee(String employeeName, double salary, String department) {
        this.employeeName = employeeName;
        this.salary = salary;
        this.department = department;
    }

    // Getter and Setter for employeeName
    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    // Getter and Setter for salary
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Getter and Setter for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // toString() method for easy printing
    @Override
    public String toString() {
        return "Employee [Name=" + employeeName + 
               ", Salary=" + salary + 
               ", Department=" + department + "]";
    }
}

