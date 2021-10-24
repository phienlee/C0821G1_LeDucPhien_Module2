package review_oop.ex_4.repository;

import review_oop.ex_4.model.Fresher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FresherRepository implements ICandidateRepository<Fresher> {
    private static List<Fresher> fresherList = new ArrayList<>(Arrays.asList(
            new Fresher(1, "Duy", "Le",
                    1999, "Sai Gon", "09099999987",
                    "Dule1@gmail.com", 1, "20/10/2021",
                    "B", "CodegymDaNang"),
            new Fresher(2, "Vy", "Le",
                    1992, "Da Nang", "09099999897",
                    "Dule2@gmail.com", 1, "20/10/2021",
                    "A", "CodegymDaNang"),
            new Fresher(3, "Du3", "Nguyen",
                    1994, "Ha Noi", "09099995555",
                    "Dule3@gmail.com", 1, "20/10/2021",
                    "D", "CodegymDaNang"),
            new Fresher(4, "Duy Duc", "Nguyen",
                    1995, "Da Nang", "09099996666",
                    "Dule4@gmail.com", 1, "20/10/2021",
                    "A", "CodegymDaNang"),
            new Fresher(5, "Du5", "Pham",
                    1989, "Da Nang", "09099996669",
                    "Dule6@gmail.com", 1, "20/10/2021",
                    "E", "CodegymDaNang"),
            new Fresher(6, "Du6", "Phan",
                    2000, "Da Nang", "0909459999",
                    "Dule9@gmail.com", 1, "20/10/2021",
                    "F", "CodegymDaNang"),
            new Fresher(7, "Phie0n7", "Ho",
                    1998, "Da Nang", "0909996799",
                    "Dule1@gmail.com", 1, "20/10/2021",
                    "A", "CodegymDaNang")
    ));

    @Override
    public List<Fresher> getAll() {
        return fresherList;
    }

    @Override
    public void add(Fresher fresher) {
        fresherList.add(fresher);
    }

    @Override
    public void delete(int id) {
        Fresher fresher = findById(id);
        fresherList.remove(fresher);
    }

    @Override
    public void update(int id, Fresher fresher) {
        for (int i = 0; i < fresherList.size(); i++) {
            if (fresherList.get(i).getIdCandidate() == id) {
                fresherList.set(i, fresher);
            }
        }
    }

    @Override
    public Fresher findById(int id) {
        Fresher fresher = null;
        for (int i = 0; i < fresherList.size(); i++) {
            if (fresherList.get(i).getIdCandidate() == id) {
                fresher = fresherList.get(i);
            }
        }
        return fresher;
    }

    @Override
    public List<Fresher> search(String keyword) {
        List<Fresher> searchList = new ArrayList<>();
        for (int i = 0; i < fresherList.size(); i++) {
            if (fresherList.get(i).getLastName().contains(keyword) || fresherList.get(i).getFirstName().contains(keyword)) {
                searchList.add(fresherList.get(i));
            }
        }
        return searchList;
    }
}
