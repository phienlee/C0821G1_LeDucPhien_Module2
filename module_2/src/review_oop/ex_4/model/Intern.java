package review_oop.ex_4.model;

public class Intern extends Candidate {
    private String majors;
    private String semester;
    private String universityName;

    public Intern() {
    }

    public Intern(String majors, String semester, String universityName) {
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }

    public Intern(int idCandidate, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType, String majors, String semester, String universityName) {
        super(idCandidate, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.majors = majors;
        this.semester = semester;
        this.universityName = universityName;
    }
    public Intern(String[] strings) {
        super(Integer.parseInt(strings[0]), strings[1], strings[2], Integer.parseInt(strings[3]), strings[4], strings[5], strings[6], Integer.parseInt(strings[7]));
        this.majors = strings[8];
        this.semester = strings[9];
        this.universityName = strings[10];
    }

    public String getMajors() {
        return majors;
    }

    public void setMajors(String majors) {
        this.majors = majors;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    @Override
    public String showInfo() {
        return "Intern{" + super.toString() +
                "majors='" + majors + '\'' +
                ", semester='" + semester + '\'' +
                ", universityName='" + universityName + '\'' +
                '}';
    }

    @Override
    public String toString() {
        return super.toString() + "," + majors + "," + semester + "," + universityName;
    }
}
