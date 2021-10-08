package _04_access_modifier.exercise;

public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        student.setName("Phien");
        student.setClassName("C08");
        System.out.println(student);

    }
}
