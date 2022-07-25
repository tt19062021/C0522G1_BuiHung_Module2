package MVC_Furama_Resort.model;

public class Contract {
    private int contractId;
    private int bookingCode;
    private int depositMoney;
    private int totalPayment;
    private int customerId;

    public Contract() {
    }

    public Contract(int contractId, int bookingCode, int depositMoney, int totalPayment, int customerId) {
        this.contractId = contractId;
        this.bookingCode = bookingCode;
        this.depositMoney = depositMoney;
        this.totalPayment = totalPayment;
        this.customerId = customerId;
    }

    public int getContractId() {
        return contractId;
    }

    public void setContractId(int contractId) {
        this.contractId = contractId;
    }

    public int getBookingCode() {
        return bookingCode;
    }

    public void setBookingCode(int bookingCode) {
        this.bookingCode = bookingCode;
    }

    public int getDepositMoney() {
        return depositMoney;
    }

    public void setDepositMoney(int depositMoney) {
        this.depositMoney = depositMoney;
    }

    public int getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(int totalPayment) {
        this.totalPayment = totalPayment;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractId=" + contractId +
                ", bookingCode=" + bookingCode +
                ", depositMoney=" + depositMoney +
                ", totalPayment=" + totalPayment +
                ", customerId=" + customerId +
                '}';
    }
}
