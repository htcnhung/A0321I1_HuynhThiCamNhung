//package com.codegym.thi_m4.model;
//
//import org.hibernate.annotations.GenericGenerator;
//import org.springframework.format.annotation.DateTimeFormat;
//
//import javax.persistence.*;
//import javax.validation.constraints.Min;
//import javax.validation.constraints.NotEmpty;
//import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Pattern;
//import java.util.Date;
//import java.util.Set;
//
//@Entity(name = "employee")
//public class Employee {
//    @Id
//    @GeneratedValue(generator = "my_generator")
//    @GenericGenerator(name = "my_generator", strategy = "com.codegym.case_study_4.common.MyGeneratorEmployee")
//    private String employeeID;
//
//    @NotEmpty(message = "Vui lòng điền tên vào!")
//    @Pattern(regexp = "([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$", message = "Tên không được để trống!")
//    private String employeeName;
//
//    @DateTimeFormat(pattern = "yyyy-MM-dd")
//    @NotNull(message = "Vui lòng chọn ngày sinh nhật!")
//    private Date employeeBirthDay;
//
//    @NotEmpty(message = "Vui lòng điền ID card!")
//    @Pattern(regexp = "^[0-9]{9}$", message = "Id card phải có 9 số!")
//    private String employeeIdCard;
//
//    @NotEmpty(message = "Vui lòng nhập tiền lương!")
//    @Min(value = 0, message = "Lương phải lớn hơn không!")
//    private String employeeSalary;
//
//    @NotEmpty(message = "Vui lòng nhập số điện thoại!")
//    @Pattern(regexp = "^(0|(\\(\\+84\\)))[35789]\\d{8}$", message = "Số điện thoại phải là 0XXXXXXXXX hoặc (+84)XXXXXXXXX")
//    private String employeePhone;
//
//    @NotEmpty(message = "Vui lòng nhập email")
//    @Pattern(regexp = "^[a-z0-9_]+[a-z0-9]@([a-z0-9]+\\.)[a-z]+(|\\.[a-z]+)$", message = "Email phải là abc@gmail.com hoặc abc@yahoo.com.vn")
//    private String employeeMail;
//
//    @NotEmpty(message = "Vui lòng điền địa chỉ vào!")
//    private String employeeAddress;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "position_id", referencedColumnName = "positionId")
//    private Position positionId;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "education_degree_id", referencedColumnName = "educationDegreeId")
//    private EducationDegree educationDegreeId;
//
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "division_id", referencedColumnName = "divisionId")
//    private Division divisionId;
//
//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "user_name_id", referencedColumnName = "user_id")
//    private User user;
//
//    @OneToMany(mappedBy = "employeeId")
//    private Set<Contract> contractSet;
//
//    public Employee() {
//    }
//
//    public String getEmployeeID() {
//        return employeeID;
//    }
//
//    public void setEmployeeID(String employeeID) {
//        this.employeeID = employeeID;
//    }
//
//    public String getEmployeeName() {
//        return employeeName;
//    }
//
//    public void setEmployeeName(String employeeName) {
//        this.employeeName = employeeName;
//    }
//
//    public Date getEmployeeBirthDay() {
//        return employeeBirthDay;
//    }
//
//    public void setEmployeeBirthDay(Date employeeBirthDay) {
//        this.employeeBirthDay = employeeBirthDay;
//    }
//
//    public String getEmployeeIdCard() {
//        return employeeIdCard;
//    }
//
//    public void setEmployeeIdCard(String employeeIdCard) {
//        this.employeeIdCard = employeeIdCard;
//    }
//
//    public String getEmployeeSalary() {
//        return employeeSalary;
//    }
//
//    public void setEmployeeSalary(String employeeSalary) {
//        this.employeeSalary = employeeSalary;
//    }
//
//    public String getEmployeePhone() {
//        return employeePhone;
//    }
//
//    public void setEmployeePhone(String employeePhone) {
//        this.employeePhone = employeePhone;
//    }
//
//    public String getEmployeeMail() {
//        return employeeMail;
//    }
//
//    public void setEmployeeMail(String employeeMail) {
//        this.employeeMail = employeeMail;
//    }
//
//    public String getEmployeeAddress() {
//        return employeeAddress;
//    }
//
//    public void setEmployeeAddress(String employeeAddress) {
//        this.employeeAddress = employeeAddress;
//    }
//
//    public Position getPositionId() {
//        return positionId;
//    }
//
//    public void setPositionId(Position positionId) {
//        this.positionId = positionId;
//    }
//
//    public EducationDegree getEducationDegreeId() {
//        return educationDegreeId;
//    }
//
//    public void setEducationDegreeId(EducationDegree educationDegreeId) {
//        this.educationDegreeId = educationDegreeId;
//    }
//
//    public Division getDivisionId() {
//        return divisionId;
//    }
//
//    public void setDivisionId(Division divisionId) {
//        this.divisionId = divisionId;
//    }
//
//    public User getUser() {
//        return user;
//    }
//
//    public void setUser(User user) {
//        this.user = user;
//    }
//
//    public Set<Contract> getContractSet() {
//        return contractSet;
//    }
//
//    public void setContractSet(Set<Contract> contractSet) {
//        this.contractSet = contractSet;
//    }
//}
