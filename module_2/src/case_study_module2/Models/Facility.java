package case_study_module2.Models;

public abstract class Facility {
    public static final String COMMA = ",";
    private String serviceId;
    private String serviceName;
    private double usingArea;
    private double rentalPrice;
    private int maxOfCustomer;
    private String rentalType;

    public Facility(String serviceId, String serviceName, double usingArea, double rentalPrice, int maxOfCustomer, String rentalType) {
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.usingArea = usingArea;
        this.rentalPrice = rentalPrice;
        this.maxOfCustomer = maxOfCustomer;
        this.rentalType = rentalType;
    }

    public Facility() {

    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getUsingArea() {
        return usingArea;
    }

    public void setUsingArea(double usingArea) {
        this.usingArea = usingArea;
    }

    public double getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(double rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public int getMaxOfCustomer() {
        return maxOfCustomer;
    }

    public void setMaxOfCustomer(int maxOfCustomer) {
        this.maxOfCustomer = maxOfCustomer;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return serviceId + COMMA +
                serviceName + COMMA +
                usingArea + COMMA +
                rentalPrice + COMMA +
                maxOfCustomer + COMMA +
                rentalType;
    }

    public String showInfo() {
        return "Facility{" +
                "serviceId='" + serviceId + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", usingArea=" + usingArea +
                ", rentalPrice=" + rentalPrice +
                ", maxOfCustomer=" + maxOfCustomer +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }
}
