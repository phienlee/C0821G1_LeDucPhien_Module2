package review_oop.ex_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentTest {
    public static List<Student> students = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        students.add(new Student("SV001", "Student1", "Đà Nẵng", 8));
        students.add(new Student("SV002", "Student2", "Đà Nẵng", 7.5));
        students.add(new Student("SV003", "Student3", "Đà Nẵng", 8.5));
        students.add(new Student("SV004", "Student4", "Đà Nẵng", 9));
        displayMainMenu();
    }

    public static void displayMainMenu() {
        System.out.println("1. Thêm mới sinh viên \n" +
                "2. Tìm kiếm thông tin sinh viên \n" +
                "3. Chỉnh sửa thông tin\n" +
                "4. Xóa sinh viên ra khỏi danh sách \n" +
                "5. Hiển thị danh sách sinh viên\n" +
                "6. Quay lại  \n" +
                "0. Thoát");
        int choice;
        String studentCodeDelete;
        String studentCodeSearch;
        Student student;
        do {
            choice = choiceNumber(6);

            System.out.println(choice);
            switch (choice) {
                case 1:
                    addStudent();
                    showStudentList();
                    break;
                case 2:
                    System.out.println("Nhập vào mã sinh viên để tìm kiếm");
                    studentCodeSearch = scanner.nextLine();
                    student = searchInfoStudent(studentCodeSearch);
                    if (student == null) {
                        System.out.println("Không có Sinh viên trong danh sách");
                    } else {
                        System.out.println(student);
                    }
                    break;
                case 3:
                    System.out.println("Nhập mã Sinh viên cần chỉnh sửa");
                    studentCodeSearch = scanner.nextLine();
                    if (findStudentByCode(studentCodeSearch) != null) {
                        editStudent(studentCodeSearch);
                        showStudentList();
                    } else {
                        System.out.println("Không có Sinh viên trong danh sách");
                    }

                    break;
                case 4:
                    System.out.println("Nhập vào mã sinh viên muốn xóa");
                    studentCodeDelete = scanner.nextLine();
                    deleteStudent(studentCodeDelete);
                    showStudentList();
                    break;
                case 5:
                    showStudentList();
                    break;

                case 6:
                    displayMainMenu();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Vui lòng nhập lại");
                    break;
            }
        } while (choice != 0);
    }


    private static void deleteStudent(String studentCode) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentCode().equals(studentCode)) {
                students.remove(i);
                System.out.println("Xóa thành công");
            }
        }
    }

    private static Student searchInfoStudent(String studentCode) {
        Student student = null;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentCode().equals(studentCode)) {
                student = students.get(i);
            }
        }
        return student;
    }

//    public static String autoIncrementCode() {
//        String lastStudentCode = students.get(students.size() - 1).getStudentCode();
//        lastStudentCode.substring(2);
//        return lastStudentCode;
//    }

    public static void editStudent(String studentCode) {
        Student student = findStudentByCode(studentCode);
        String nameStudent;
        String address;
        double point;
        System.out.println("Nhập tên sinh viên");
        nameStudent = scanner.nextLine();
        System.out.println("Nhập địa chỉ sinh viên");
        address = scanner.nextLine();
        System.out.println("Nhập điểm sinh viên");
        point = scanner.nextDouble();
        student.setNameStudent(nameStudent);
        student.setAddress(address);
        student.setPoint(point);
    }


    public static void addStudent() {
        String studentCode;
        String nameStudent;
        String address;
        double point;
        System.out.println("Nhập mã sinh viên");
        studentCode = scanner.nextLine();
        System.out.println("Nhập tên sinh viên");
        nameStudent = scanner.nextLine();
        System.out.println("Nhập địa chỉ sinh viên");
        address = scanner.nextLine();
        System.out.println("Nhập điểm sinh viên");
        point = scanner.nextDouble();
        Student student = new Student(studentCode, nameStudent, address, point);
        students.add(student);
    }

    public static void showStudentList() {
        for (Student student1 : students
        ) {
            System.out.println(student1);
        }
    }

    public static Student findStudentByCode(String studentCode) {
        Student student = null;
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getStudentCode().equals(studentCode)) {
                student = students.get(i);
            }
        }
        return student;
    }

    public static int choiceNumber(int number) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        boolean check;
        do {
            System.out.println("Vui lòng nhập một số");
            choice = scanner.nextInt();
            if (choice < 0 || choice > number) {
                check = false;
                System.out.println("Vui lòng nhập trong khoảng từ 0 đến " + number);
            } else {
                check = true;
            }
        } while (!check);
        return choice;
    }
}
