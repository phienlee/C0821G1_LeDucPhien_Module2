package case_study_module2.Models;

public class Room extends Facility {
    private String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String serviceId, String serviceName, double usingArea, double rentalPrice, int maxOfCustomer, String rentalType, String freeService) {
        super(serviceId, serviceName, usingArea, rentalPrice, maxOfCustomer, rentalType);
        this.freeService = freeService;
    }

    public Room() {
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() + COMMA +
                freeService;
    }

    public String showInfo() {
        return "Room{" + super.toString() +
                "freeService='" + freeService + '\'' +
                '}';
    }
}
