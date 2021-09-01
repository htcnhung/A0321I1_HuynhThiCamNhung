package models;

public class Contract {
    private int contractID;
    Booking booking;
    private String deposit;
    private String totalAmount;
    Customer customer;

    public Contract() {
    }

    public Contract(int contractID, Booking booking, String deposit, String totalAmount, Customer customer) {
        this.contractID = contractID;
        this.booking = booking;
        this.deposit = deposit;
        this.totalAmount = totalAmount;
        this.customer = customer;
    }

    public int getContractID() {
        return contractID;
    }

    public void setContractID(int contractID) {
        this.contractID = contractID;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String toString() {
        return "Contract{" +
                "id=" + getContractID() + ", Booking=" + getBooking() + ", Customer=" + getCustomer() +
                ", Deposit=" + getDeposit() + ", Total Amount =" + getTotalAmount() + "}";
    }
}
