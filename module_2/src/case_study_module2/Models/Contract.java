package case_study_module2.Models;

public class Contract {
    private String someContract;
    private String idBooking;
    private String deposits;
    private String totalPayment;
    private String idCustomer;

    public Contract(String someContract, String idBooking, String deposits, String totalPayment, String idCustomer) {
        this.someContract = someContract;
        this.idBooking = idBooking;
        this.deposits = deposits;
        this.totalPayment = totalPayment;
        this.idCustomer = idCustomer;
    }

    public Contract() {
    }

    public String getSomeContract() {
        return someContract;
    }

    public void setSomeContract(String someContract) {
        this.someContract = someContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getDeposits() {
        return deposits;
    }

    public void setDeposits(String deposits) {
        this.deposits = deposits;
    }

    public String getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(String totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "someContract='" + someContract + '\'' +
                ", idBooking='" + idBooking + '\'' +
                ", deposits='" + deposits + '\'' +
                ", totalPayment='" + totalPayment + '\'' +
                ", idCustomer='" + idCustomer + '\'' +
                '}';
    }
}
