package com.codegym.case_study_4.model;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import java.util.Date;
import java.util.Set;

@Entity(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator", strategy = "com.codegym.case_study_4.common.MyGenerator")
    private String customerID;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "customer_type_id", referencedColumnName = "customer_type_id")
    private CustomerType customerType;

    @NotEmpty(message = "Vui lòng điền tên vào!")
    @Pattern(regexp = "([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", message = "Tên đang trống hoặc định dạng tên bị sai!")
    @Column(name = "customer_name")
    private String customerName;

    @NotNull(message = "Vui lòng chọn ngày sinh nhật!")
    @Column(name = "customer_birthday")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date customerBirthDay;

    @Column(name = "customer_gender")
    private int customerGender;

    @NotEmpty(message = "Vui lòng điền ID card!")
    @Pattern(regexp = "^[0-9]{9}$", message = "Id card phải có 9 số!")
    @Column(name = "customer_id_card")
    private String customerIdCard;

    @NotEmpty(message = "Vui lòng nhập số điện thoại!")
    @Pattern(regexp = "^(0|(\\(\\+84\\)))[35789]\\d{8}$", message = "Số điện thoại phải là 0XXXXXXXXX hoặc (+84)XXXXXXXXX")
    @Column(name = "customer_phone")
    private String customerPhone;

    @NotEmpty(message = "Vui lòng nhập email")
    @Pattern(regexp = "^[a-z0-9_]+[a-z0-9]@([a-z0-9]+\\.)[a-z]+(|\\.[a-z]+)$", message = "Email phải là abc@gmail.com hoặc abc@yahoo.com.vn")
    @Column(name = "customer_mail")
    private String customerMail;

    @NotEmpty(message = "Vui lòng điền địa chỉ vào!")
    @Column(name = "customer_address")
    private String customerAddress;

    @OneToMany(mappedBy = "customerId")
    private Set<Contract> contractSet;

    public Customer() {
    }

    public Customer(String customerID, CustomerType customerType, @NotEmpty(message = "Vui lòng điền tên vào!") @Pattern(regexp = "([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", message = "Tên không được để trống!") String customerName, @NotNull(message = "Vui lòng chọn ngày sinh nhật!") Date customerBirthDay, int customerGender, @NotEmpty(message = "Vui lòng điền ID card!") @Pattern(regexp = "^[0-9]{9}$", message = "Id card phải có 9 số!") String customerIdCard, @NotEmpty(message = "Vui lòng nhập số điện thoại!") @Pattern(regexp = "^(0|(\\(\\+84\\)))[35789]\\d{8}$", message = "Số điện thoại phải là 0XXXXXXXXX hoặc (+84)XXXXXXXXX") String customerPhone, @NotEmpty(message = "Vui lòng nhập email") @Pattern(regexp = "^[a-z0-9_]+[a-z0-9]@([a-z0-9]+\\.)[a-z]+(|\\.[a-z]+)$", message = "Email phải là abc@gmail.com hoặc abc@yahoo.com.vn") String customerMail, @NotEmpty(message = "Vui lòng điền địa chỉ vào!") String customerAddress) {
        this.customerID = customerID;
        this.customerType = customerType;
        this.customerName = customerName;
        this.customerBirthDay = customerBirthDay;
        this.customerGender = customerGender;
        this.customerIdCard = customerIdCard;
        this.customerPhone = customerPhone;
        this.customerMail = customerMail;
        this.customerAddress = customerAddress;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public CustomerType getCustomerType() {
        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getCustomerBirthDay() {
        return customerBirthDay;
    }

    public void setCustomerBirthDay(Date customerBirthDay) {
        this.customerBirthDay = customerBirthDay;
    }

    public int getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(int customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdCard() {
        return customerIdCard;
    }

    public void setCustomerIdCard(String customerIdCard) {
        this.customerIdCard = customerIdCard;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Set<Contract> getContractSet() {
        return contractSet;
    }

    public void setContractSet(Set<Contract> contractSet) {
        this.contractSet = contractSet;
    }
}
