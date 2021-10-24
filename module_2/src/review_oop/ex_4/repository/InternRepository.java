package review_oop.ex_4.repository;

import review_oop.ex_4.model.Fresher;
import review_oop.ex_4.model.Intern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InternRepository implements ICandidateRepository<Intern> {
    private static List<Intern> internList = new ArrayList<>(Arrays.asList(
            new Intern(1, "Phien1", "Le",
                    1999, "Sai Gon", "09099999987",
                    "phienle1@gmail.com", 2, "CNTT",
                    "B", "CodegymDaNang"),
            new Intern(2, "Phien2", "Le",
                    1992, "Da Nang", "09099999897",
                    "phienle2@gmail.com", 2, "CNTT",
                    "A", "CodegymDaNang"),
            new Intern(3, "Phien3", "Le",
                    1994, "Ha Noi", "09099995555",
                    "phienle3@gmail.com", 2, "CNTT",
                    "D", "CodegymDaNang"),
            new Intern(4, "Phien4", "Le",
                    1995, "Da Nang", "09099996666",
                    "phienle4@gmail.com", 2, "CNTT",
                    "A", "CodegymDaNang"),
            new Intern(5, "Phien5", "Le",
                    1989, "Da Nang", "09099996669",
                    "phienle6@gmail.com", 2, "CNTT",
                    "E", "CodegymDaNang"),
            new Intern(6, "Phien6", "Le",
                    2000, "Da Nang", "0909459999",
                    "phienle9@gmail.com", 2, "CNTT",
                    "F", "CodegymDaNang"),
            new Intern(7, "Phie0n7", "Le",
                    1998, "Da Nang", "0909996799",
                    "phienle1@gmail.com", 2, "CNTT",
                    "A", "CodegymDaNang")
    ));

    @Override
    public List<Intern> getAll() {
        return internList;
    }

    @Override
    public void add(Intern intern) {
        internList.add(intern);
    }

    @Override
    public void delete(int id) {
        Intern intern = findById(id);
        internList.remove(intern);
    }

    @Override
    public void update(int id, Intern intern) {
        for (int i = 0; i < internList.size(); i++) {
            if (internList.get(i).getIdCandidate() == id) {
                internList.set(i, intern);
            }
        }

    }

    @Override
    public Intern findById(int id) {
        Intern intern = null;
        for (int i = 0; i < internList.size(); i++) {
            if (internList.get(i).getIdCandidate() == id) {
                intern = internList.get(i);
            }
        }
        return intern;
    }

    @Override
    public List<Intern> search(String keyword) {
        List<Intern> searchList = new ArrayList<>();
        for (int i = 0; i < internList.size(); i++) {
            if (internList.get(i).getLastName().contains(keyword) || internList.get(i).getFirstName().contains(keyword)) {
                searchList.add(internList.get(i));
            }
        }
        return searchList;
    }
}
