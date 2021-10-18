package review_oop.ex_3;

//Hệ thông quản lý sinh viên của trường ABC gồm có đối tượng sau:
//        - SinhVien có các thuộc tính: mã sinh viên, tên, địa chỉ, điểm số.
//
//        Xây dựng lớp quản lý sinh viên với các chức năng sau:
//        - Thêm mới sinh viên vào danh sách.
//        - Xem được danh sách sinh viên.
//        - Sửa thông tin một sinh viên trong danh sách. (theo index)
//        - Xóa sinh viên ra khỏi danh sách. (theo index)
//        - Kiểm tra sinh viên có mã sinh viên là YYY đã có trong trong danh sách chưa ?
//        - Nhập vào mã sinh viên và hiển thị thông tin của sinh viên đó, nếu mã sinh viên không tồn tại trong danh sách thì hiển thị thông báo lỗi.
//        - Sắp xếp sinh viên theo "điểm số". (tăng hoặc giảm dần)
//
//        (sử dụng ArrayList hoặc LinkedList của collection framework để triển khai bài toán trên

public class Student {
    private String studentCode;
    private String nameStudent;
    private String address;
    private double point;

    public Student(String studentCode, String nameStudent, String address, double point) {
        this.studentCode = studentCode;
        this.nameStudent = nameStudent;
        this.address = address;
        this.point = point;
    }

    public String getStudentCode() {
        return studentCode;
    }

    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    public String getNameStudent() {
        return nameStudent;
    }

    public void setNameStudent(String nameStudent) {
        this.nameStudent = nameStudent;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentCode='" + studentCode + '\'' +
                ", nameStudent='" + nameStudent + '\'' +
                ", address='" + address + '\'' +
                ", point=" + point +
                '}';
    }
}
