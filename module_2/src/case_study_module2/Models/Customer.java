package case_study_module2.Models;

public class Customer extends Person implements Comparable<Customer> {
    private String customerType;
    private String address;

    public Customer(String id, String name, String birthday, String gender, String idCard, String phone, String email, String customerType, String address) {
        super(id, name, birthday, gender, idCard, phone, email);
        this.customerType = customerType;
        this.address = address;
    }

    public Customer(String customerType, String address) {
        this.customerType = customerType;
        this.address = address;
    }

    public Customer() {
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return super.toString() + COMMA +
                customerType + COMMA +
                address;
    }

    @Override
    public String showInfo() {
        return "Customer{" + super.showInfo() +
                "customerType='" + customerType + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Customer o) {
        return 0;
    }
}
