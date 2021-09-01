package models;

public class Room extends Facility {
    private String freeService;

    public Room() {
    }

    public Room(int serviceID, String serviceName, double usableArea, String rentExpense, int maximumNumberOfPeople, String typesOfRent, String freeService) {
        super(serviceID, serviceName, usableArea, rentExpense, maximumNumberOfPeople, typesOfRent);
        this.freeService = freeService;
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Service:Room{" +
                "service ID=" + getServiceID() + ", service name= " + getServiceName() + ", usable area= " + getUsableArea() + ", rent expense=" + getRentExpense() + ", maximumNumber of people:"
                + getMaximumNumberOfPeople() + ", types of rent=" + getTypesOfRent() + ", free service=" + getFreeService() + "}";
    }
}
