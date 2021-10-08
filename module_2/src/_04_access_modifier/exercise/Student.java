package _04_access_modifier.exercise;

public class Student {
    private String name = "John";
    private String className = "C02";

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
}
