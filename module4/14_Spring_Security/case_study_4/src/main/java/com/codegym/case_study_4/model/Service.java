package com.codegym.case_study_4.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.Set;

@Entity(name = "service")
public class Service {
    @Id
    @GeneratedValue(generator = "my_generator")
    @GenericGenerator(name = "my_generator", strategy = "com.codegym.case_study_4.common.MyGeneratorService")
    private String serviceID;

    @NotEmpty(message = "Vui lòng tên service!")
    private String serviceName;

    @NotEmpty(message = "Vui lòng nhập diện tích!")
    @Min(value = 0, message = "Diện tích bắt buộc phải lớn hơn không!")
    private String serviceArea;

    @NotEmpty(message = "Vui lòng nhập giá!")
    @Min(value = 0, message = "Giá bắt buộc phải lớn hơn không!")
    private String serviceCost;

    @NotEmpty(message = "Vui lòng nhập số người giới hạn!")
    @Min(value = 0, message = "Số người giới hạn bắt buộc phải lớn hơn không!")
    private String serviceMaxPeople;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "rent_type_id", referencedColumnName = "rent_type_id")
    private RentType rentType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "service_type_id", referencedColumnName = "service_type_id")
    private ServiceType serviceType;

    private String standardRoom;
    private String descriptionOtherConvenience;

    @NotEmpty(message = "Vui lòng nhập diện tích hồ bơi!")
    @Min(value = 0, message = "Diện tích hồ bơi bắt buộc phải lớn hơn không!")
    private String poolArea;

    @NotEmpty(message = "Vui lòng nhập số tầng!")
    @Min(value = 0, message = "Số tầng bắt buộc phải lớn hơn không!")
    private String numberFloor;

    @OneToMany(mappedBy = "serviceId")
    private Set<Contract> contractSet;

    public Service() {
    }

    public String getServiceID() {
        return serviceID;
    }

    public void setServiceID(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceArea() {
        return serviceArea;
    }

    public void setServiceArea(String serviceArea) {
        this.serviceArea = serviceArea;
    }

    public String getServiceCost() {
        return serviceCost;
    }

    public void setServiceCost(String serviceCost) {
        this.serviceCost = serviceCost;
    }

    public String getServiceMaxPeople() {
        return serviceMaxPeople;
    }

    public void setServiceMaxPeople(String serviceMaxPeople) {
        this.serviceMaxPeople = serviceMaxPeople;
    }

    public RentType getRentType() {
        return rentType;
    }

    public void setRentType(RentType rentType) {
        this.rentType = rentType;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getDescriptionOtherConvenience() {
        return descriptionOtherConvenience;
    }

    public void setDescriptionOtherConvenience(String descriptionOtherConvenience) {
        this.descriptionOtherConvenience = descriptionOtherConvenience;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public String getNumberFloor() {
        return numberFloor;
    }

    public void setNumberFloor(String numberFloor) {
        this.numberFloor = numberFloor;
    }

    public Set<Contract> getContractSet() {
        return contractSet;
    }

    public void setContractSet(Set<Contract> contractSet) {
        this.contractSet = contractSet;
    }
}
