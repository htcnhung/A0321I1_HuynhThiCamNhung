package models;

import java.io.Serializable;

public abstract class Facility implements Serializable {
    private int serviceID;
    private String serviceName;
    private double usableArea;
    private String rentExpense;
    private int maximumNumberOfPeople;
    private String typesOfRent;

    public Facility() {
    }

    public Facility(int serviceID, String serviceName, double usableArea, String rentExpense, int maximumNumberOfPeople, String typesOfRent) {
       this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.usableArea = usableArea;
        this.rentExpense = rentExpense;
        this.maximumNumberOfPeople = maximumNumberOfPeople;
        this.typesOfRent = typesOfRent;
    }

    public int getServiceID() {
        return serviceID;
    }

    public void setServiceID(int serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsableArea() {
        return usableArea;
    }

    public void setUsableArea(double usableArea) {
        this.usableArea = usableArea;
    }

    public String getRentExpense() {
        return rentExpense;
    }

    public void setRentExpense(String rentExpense) {
        this.rentExpense = rentExpense;
    }

    public int getMaximumNumberOfPeople() {
        return maximumNumberOfPeople;
    }

    public void setMaximumNumberOfPeople(int maximumNumberOfPeople) {
        this.maximumNumberOfPeople = maximumNumberOfPeople;
    }

    public String getTypesOfRent() {
        return typesOfRent;
    }

    public void setTypesOfRent(String typesOfRent) {
        this.typesOfRent = typesOfRent;
    }
}
