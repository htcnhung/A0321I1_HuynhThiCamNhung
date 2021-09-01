package models;

public class House extends Facility {
    private String standardRoom;
    private int floorNumber;

    public House() {
    }

    public House(int serviceID, String serviceName, double usableArea, String rentExpense, int maximumNumberOfPeople, String typesOfRent, String standardRoom, int floorNumber) {
        super(serviceID, serviceName, usableArea, rentExpense, maximumNumberOfPeople, typesOfRent);
        this.standardRoom = standardRoom;
        this.floorNumber = floorNumber;
    }

    public String getStandardRoom() {
        return standardRoom;
    }

    public void setStandardRoom(String standardRoom) {
        this.standardRoom = standardRoom;
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    @Override
    public String toString() {
        return "Service:House{" +
                "service ID=" + getServiceID() + ", service name= " + getServiceName() + ", usable area= " + getUsableArea() + ", rent expense=" + getRentExpense() + ", maximumNumber of people:"
                + getMaximumNumberOfPeople() + ", types of rent=" + getTypesOfRent() + "}";
    }
}
