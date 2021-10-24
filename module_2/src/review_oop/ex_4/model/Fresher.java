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
        return "Fresher{" + super.toString() +
                "graduationDate='" + graduationDate + '\'' +
                ", graduationRank='" + graduationRank + '\'' +
                ", education='" + education + '\'' +
                '}';
    }
}
