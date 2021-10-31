package review_oop.ex_4.model;

public class Fresher extends Candidate {
    private String graduationDate;
    private String graduationRank;
    private String education;

    public Fresher() {
    }

    public Fresher(String graduationDate, String graduationRank, String education) {
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public Fresher(int idCandidate, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType, String graduationDate, String graduationRank, String education) {
        super(idCandidate, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.graduationDate = graduationDate;
        this.graduationRank = graduationRank;
        this.education = education;
    }

    public Fresher(String[] strings) {
        super(Integer.parseInt(strings[0]), strings[1], strings[2], Integer.parseInt(strings[3]), strings[4], strings[5], strings[6], Integer.parseInt(strings[7]));
        this.graduationDate = strings[8];
        this.graduationRank = strings[9];
        this.education = strings[10];
    }

    public String getGraduationDate() {
        return graduationDate;
    }

    public void setGraduationDate(String graduationDate) {
        this.graduationDate = graduationDate;
    }

    public String getGraduationRank() {
        return graduationRank;
    }

    public void setGraduationRank(String graduationRank) {
        this.graduationRank = graduationRank;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    @Override
    public String toString() {
        return super.toString() + "," + graduationDate + "," + graduationRank + "," + education;
    }

    @Override
    public String showInfo() {
        return "Fresher{" + super.showInfo() +
                "graduationDate='" + graduationDate + '\'' +
                ", graduationRank='" + graduationRank + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
