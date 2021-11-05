package case_study_module2.Models;

public class Employee extends Person {
    private String level;
    private String location;
    private String wage;

    public Employee(String id, String name, String birthday, String gender, String idCard, String phone, String email, String level, String location, String wage) {
        super(id, name, birthday, gender, idCard, phone, email);
        this.level = level;
        this.wage = wage;
    }

    public Employee(String level, String location, String wage) {
        this.level = level;
        this.location = location;
        this.wage = wage;
    }

    public Employee() {
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return super.toString() + COMMA +
                level + COMMA +
                location + COMMA +
                wage;
    }

    @Override
    public String showInfo() {
        return "Employee{" + super.showInfo() +
                "level='" + level + '\'' +
                ", location='" + location + '\'' +
                ", wage='" + wage + '\'' +
                '}';
    }
}
