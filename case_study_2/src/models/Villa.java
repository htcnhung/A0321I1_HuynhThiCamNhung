package models;

public class Villa extends Facility {

    private String standardRoom;
    private String poolArea;
    private int floorNumber;

    public Villa() {
    }

    public Villa(String standardRoom, String poolArea, int floorNumber) {
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;
    }

    public Villa(int serviceID, String serviceName, double usableArea, String rentExpense, int maximumNumberOfPeople, String typesOfRent, String standardRoom, String poolArea, int floorNumber) {
        super(serviceID, serviceName, usableArea, rentExpense, maximumNumberOfPeople, typesOfRent);
        this.standardRoom = standardRoom;
        this.poolArea = poolArea;
        this.floorNumber = floorNumber;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public String getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(String poolArea) {
        this.poolArea = poolArea;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Service:Villa:{" +
                "service ID=" + getServiceID() + ", service name= " + getServiceName() + ", usable area= " + getUsableArea() + ", rent expense=" + getRentExpense() + ", maximumNumber of people:"
                + getMaximumNumberOfPeople() + ", types of rent=" + getTypesOfRent() + ", room standar=" + getStandardRoom() + ", pool area=" + getPoolArea() + ", floor number=" + getFloorNumber() + "}";
    }
}
