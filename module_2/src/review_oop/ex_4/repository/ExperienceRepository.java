package review_oop.ex_4.repository;

import review_oop.ex_4.model.ExperienceCandidate;
import review_oop.ex_4.model.Fresher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExperienceRepository implements ICandidateRepository<ExperienceCandidate> {
    private static List<ExperienceCandidate> experienceCandidateList = new ArrayList<>(Arrays.asList(
            new ExperienceCandidate(1, "Duy", "Le",
                    1999, "Sai Gon", "09099999987",
                    "Dule1@gmail.com", 0,
                    5, "C++"),
            new ExperienceCandidate(2, "Vy", "Le",
                    1992, "Da Nang", "09099999897",
                    "Dule2@gmail.com", 0,
                    3, "CodegymDaNang"),
            new ExperienceCandidate(3, "Du3", "Nguyen",
                    1994, "Ha Noi", "09099995555",
                    "Dule3@gmail.com", 0, 2
                    , "CodegymDaNang"),
            new ExperienceCandidate(4, "Duy Duc", "Nguyen",
                    1995, "Da Nang", "09099996666",
                    "Dule4@gmail.com", 0, 7
                    , "CodegymDaNang"),
            new ExperienceCandidate(5, "Du5", "Pham",
                    1989, "Da Nang", "09099996669",
                    "Dule6@gmail.com", 0, 8
                    , "CodegymDaNang"),
            new ExperienceCandidate(6, "Du6", "Phan",
                    2000, "Da Nang", "0909459999",
                    "Dule9@gmail.com", 0, 4
                    , "CodegymDaNang"),
            new ExperienceCandidate(7, "Phie0n7", "Ho",
                    1998, "Da Nang", "0909996799",
                    "Dule1@gmail.com", 0, 1
                    , "CodegymDaNang")
    ));

    @Override
    public List getAll() {
        return experienceCandidateList;
    }

    @Override
    public void add(ExperienceCandidate experienceCandidate) {
        experienceCandidateList.add(experienceCandidate);
    }

    @Override
    public void delete(int id) {
       ExperienceCandidate experienceCandidate = findById(id);
       experienceCandidateList.remove(experienceCandidate);
    }

    @Override
    public void update(int id, ExperienceCandidate experienceCandidate) {
        for (int i = 0; i < experienceCandidateList.size(); i++) {
            if (experienceCandidateList.get(i).getIdCandidate() == id) {
                experienceCandidateList.set(i, experienceCandidate);
            }
        }
    }

    @Override
    public ExperienceCandidate findById(int id) {
        ExperienceCandidate experienceCandidate = null;
        for (int i = 0; i < experienceCandidateList.size(); i++) {
            if (experienceCandidateList.get(i).getIdCandidate() == id) {
                experienceCandidate = experienceCandidateList.get(i);
            }
        }
        return experienceCandidate;
    }

    @Override
    public List<ExperienceCandidate> search(String keyword) {
        List<ExperienceCandidate> searchList = new ArrayList<>();
        for (int i = 0; i < experienceCandidateList.size(); i++) {
            if (experienceCandidateList.get(i).getLastName().contains(keyword) || experienceCandidateList.get(i).getFirstName().contains(keyword)) {
                searchList.add(experienceCandidateList.get(i));
            }
        }
        return searchList;
    }
}
