package com.tigerland.hms.model;

public class Employee {
    private int eId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String Department;
    private int phoneNumber;
    private Double salary;


    public Employee() {
    }

    public Employee(int eId, String firstName, String middleName, String lastName, String address, String department, int phoneNumber, Double salary) {
        this.eId = eId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.address = address;
        Department = department;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
    }

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "eId=" + eId +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", Department='" + Department + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", salary=" + salary +
                '}';
    }
}
