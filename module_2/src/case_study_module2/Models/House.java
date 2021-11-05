package case_study_module2.Models;

public class House extends Facility {
    private String roomStandard;
    private String numOfFloors;

    public House(String serviceId, String serviceName, double usingArea, double rentalPrice, int maxOfCustomer, String rentalType, String roomStandard, String numOfFloors) {
        super(serviceId, serviceName, usingArea, rentalPrice, maxOfCustomer, rentalType);
        this.roomStandard = roomStandard;
        this.numOfFloors = numOfFloors;
    }

    public House(String roomStandard, String numOfFloors) {
        this.roomStandard = roomStandard;
        this.numOfFloors = numOfFloors;
    }

    public House() {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getNumOfFloors() {
        return numOfFloors;
    }

    public void setNumOfFloors(String numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    public String toString() {
        return super.toString() + COMMA +
                roomStandard + COMMA +
                numOfFloors;
    }

    public String showInfo() {
        return "House{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", numOfFloors='" + numOfFloors + '\'' +
                '}';
    }
}
