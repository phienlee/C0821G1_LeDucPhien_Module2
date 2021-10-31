package review_oop.ex_4.repository;

import review_oop.ex_4.common.ReadAndWriteFile;
import review_oop.ex_4.model.Fresher;

import java.util.ArrayList;
import java.util.List;

public class FresherRepository implements ICandidateRepository<Fresher> {
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    @Override
    public List<Fresher> getAll() {
        List<Fresher> fresherList = new ArrayList<>();
        List<String[]> list = readAndWriteFile.readFromFile("freshers.csv");
        for (String[] strings : list) {
            Fresher fresher = new Fresher(strings);
            fresherList.add(fresher);
        }
        return fresherList;
    }

    @Override
    public void add(Fresher fresher) {
        List<Fresher> fresherList = getAll();
        fresherList.add(fresher);
        readAndWriteFile.writeToFile("freshers.csv", fresherList, false);
    }

    @Override
    public void delete(int id) {
        List<Fresher> fresherList = getAll();
        for (int i = 0; i < fresherList.size(); i++) {
            if (fresherList.get(i).getIdCandidate() == id) {
                fresherList.remove(i);
            }
        }
        readAndWriteFile.writeToFile("fresher.csv", fresherList, false);
    }

    @Override
    public void update(int id, Fresher fresher) {
        List<Fresher> list = getAll();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdCandidate() == id) {
                list.set(i, fresher);
            }
        }
        readAndWriteFile.writeToFile("fresher.csv", list, false);
    }

    @Override
    public Fresher findById(int id) {
        List<Fresher> fresherList = getAll();
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
        List<Fresher> fresherList = getAll();
        for (int i = 0; i < fresherList.size(); i++) {
            if (fresherList.get(i).getLastName().contains(keyword) || fresherList.get(i).getFirstName().contains(keyword)) {
                searchList.add(fresherList.get(i));
            }
        }
        return searchList;
    }
}
