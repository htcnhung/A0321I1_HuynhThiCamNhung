package models;

public class Customer extends Person {
    private String Gender;
    private String identityCardNumber;
    private String phoneNumber;
    private String email;
    private String customerType;

    public Customer() {
    }

    public Customer(int id, String name, String age, String address, String gender, String identityCardNumber, String phoneNumber, String email, String customerType) {
        super(id, name, age, address);
        Gender = gender;
        this.identityCardNumber = identityCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
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

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + getId() + ", name= " + getName() + ", age= " + getAge() + ", address=" + getAddress() + ", gender:"
                + getGender() + ", Identity Card Number=" + getIdentityCardNumber() + ", Phone Number=" + getPhoneNumber()
                + ", email=" + getEmail() + ", Customer type= " + getCustomerType() + "}";
    }
}
