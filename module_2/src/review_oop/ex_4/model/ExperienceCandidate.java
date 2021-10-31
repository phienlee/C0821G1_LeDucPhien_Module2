package review_oop.ex_4.model;

public class ExperienceCandidate extends Candidate {
    private int expInYear;
    private String proKill;

    public ExperienceCandidate() {
    }

    public ExperienceCandidate(int expInYear, String proKill) {
        this.expInYear = expInYear;
        this.proKill = proKill;
    }

    public ExperienceCandidate(int idCandidate, String firstName, String lastName, int birthDate, String address, String phone, String email, int candidateType, int expInYear, String proKill) {
        super(idCandidate, firstName, lastName, birthDate, address, phone, email, candidateType);
        this.expInYear = expInYear;
        this.proKill = proKill;
    }

    public ExperienceCandidate(String[] strings) {
        super(Integer.parseInt(strings[0]), strings[1], strings[2], Integer.parseInt(strings[3]), strings[4], strings[5], strings[6], Integer.parseInt(strings[7]));
        this.expInYear = Integer.parseInt(strings[8]);
        this.proKill = strings[9];

    }

    public int getExpInYear() {
        return expInYear;
    }

    public void setExpInYear(int expInYear) {
        this.expInYear = expInYear;
    }

    public String getProKill() {
        return proKill;
    }

    public void setProKill(String proKill) {
        this.proKill = proKill;
    }

    @Override
    public String toString() {
        return super.toString() + "," + expInYear + "," + proKill;
    }

    @Override
    public String showInfo() {
        return "ExperienceCandidate{" + super.toString() +
                "expInYear=" + expInYear +
                ", proKill='" + proKill + '\'' +
                '}';
    }
}
