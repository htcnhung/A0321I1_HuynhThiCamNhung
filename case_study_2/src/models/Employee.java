package models;

import java.io.Serializable;

public class Employee extends Person {
    private String Gender;
    private String identityCardNumber;
    private String phoneNumber;
    private String email;
    private String level;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(int id, String name, String age, String address, String gender, String identityCardNumber, String phoneNumber, String email, String level, String position, int salary) {
        super(id, name, age, address);
        Gender = gender;
        this.identityCardNumber = identityCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getIdentityCardNumber() {
        return identityCardNumber;
    }

    public void setIdentityCardNumber(String identityCardNumber) {
        this.identityCardNumber = identityCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + getId() + ", name= " + getName() + ", age= " + getAge() + ", address=" + getAddress() + ", gender:"
                + getGender() + ", Identity Card Number=" + getIdentityCardNumber() + ", Phone Number=" + getPhoneNumber()
                + ", email=" + getEmail() + ", Level= " + getLevel() + ", position=" + getPosition() + ", salary=" + getSalary() + "}";
    }
}
