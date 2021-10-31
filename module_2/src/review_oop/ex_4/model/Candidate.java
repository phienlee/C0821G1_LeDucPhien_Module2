package review_oop.ex_4.model;

public abstract class Candidate {
    private int idCandidate;
    private String firstName;
    private String lastName;
    private int birthdate;
    private String address;
    private String phone;
    private String email;
    private int candidateType;

    public Candidate() {
    }

    public Candidate(int idCandidate, String firstName, String lastName, int birthdate,
                     String address, String phone, String email, int candidateType) {
        this.idCandidate = idCandidate;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.candidateType = candidateType;
    }

    public int getIdCandidate() {
        return idCandidate;
    }

    public void setIdCandidate(int idCandidate) {
        this.idCandidate = idCandidate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getCandidateType() {
        return candidateType;
    }

    public void setCandidateType(int candidateType) {
        this.candidateType = candidateType;
    }

    @Override
    public String toString() {
        return idCandidate+ "," + firstName + "," + lastName + "," + birthdate + "," + address + "," + phone + "," + email + "," + candidateType;
    }

    public String showInfo() {
        return "Candidate{" +
                "idCandidate=" + idCandidate +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate=" + birthdate +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", candidateType=" + candidateType +
                '}';
    }
}
