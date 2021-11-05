package case_study_module2.Models;

public class Villa extends Facility {
    private String roomStandard;
    private String otherUtilities;
    private double areaOfPool;
    private int numOfFloors;

    public Villa(String roomStandard, String otherUtilities, double areaOfPool, int numOfFloors) {
        this.roomStandard = roomStandard;
        this.otherUtilities = otherUtilities;
        this.areaOfPool = areaOfPool;
        this.numOfFloors = numOfFloors;
    }

    public Villa(String serviceId, String serviceName, double usingArea, double rentalPrice, int maxOfCustomer, String rentalType, String roomStandard, String otherUtilities, double areaOfPool, int numOfFloors) {
        super(serviceId, serviceName, usingArea, rentalPrice, maxOfCustomer, rentalType);
        this.roomStandard = roomStandard;
        this.otherUtilities = otherUtilities;
        this.areaOfPool = areaOfPool;
        this.numOfFloors = numOfFloors;
    }

    public Villa() {
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getOtherUtilities() {
        return otherUtilities;
    }

    public void setOtherUtilities(String otherUtilities) {
        this.otherUtilities = otherUtilities;
    }

    public double getAreaOfPool() {
        return areaOfPool;
    }

    public void setAreaOfPool(double areaOfPool) {
        this.areaOfPool = areaOfPool;
    }

    public int getnumOfFloors() {
        return numOfFloors;
    }

    public void setnumOfFloors(int numOfFloors) {
        this.numOfFloors = numOfFloors;
    }

    @Override
    public String toString() {
        return super.toString()+ COMMA+
                roomStandard + COMMA +
                otherUtilities + COMMA +
                areaOfPool + COMMA +
                numOfFloors;
    }

    public String showInfo() {
        return "Villa{" + super.toString() +
                "roomStandard='" + roomStandard + '\'' +
                ", otherUtilities='" + otherUtilities + '\'' +
                ", areaOfPool=" + areaOfPool +
                ", numOfFloors=" + numOfFloors +
                '}';
    }
}
