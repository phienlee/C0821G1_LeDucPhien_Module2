package review_oop.ex_4.repository;

import review_oop.ex_4.common.ReadAndWriteFile;
import review_oop.ex_4.model.Fresher;
import review_oop.ex_4.model.Intern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InternRepository implements ICandidateRepository<Intern> {
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();

    @Override
    public List<Intern> getAll() {
        List<Intern> internList = new ArrayList<>();
        List<String[]> list = readAndWriteFile.readFromFile("intern.csv");
        for (String[] strings : list) {
            Intern intern = new Intern(strings);
            internList.add(intern);
    }
        return internList;
    }

    @Override
    public void add(Intern intern) {
        List<Intern> internList = getAll();
        internList.add(intern);
        readAndWriteFile.writeToFile("intern.csv", internList, false);
    }

    @Override
    public void delete(int id) {
        List<Intern> internList = getAll();
        for (int i = 0; i < internList.size(); i++) {
            if (internList.get(i).getIdCandidate() == id) {
                internList.remove(i);
            }
        }
        readAndWriteFile.writeToFile("intern.csv", internList, false);
    }

    @Override
    public void update(int id, Intern intern) {
        List<Intern> list = getAll();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getIdCandidate() == id) {
                list.set(i, intern);
            }
        }
        readAndWriteFile.writeToFile("intern.csv", list, false);
    }

    @Override
    public Intern findById(int id) {
        List<Intern> internList = getAll();
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
        List<Intern> internList = getAll();
        for (int i = 0; i < internList.size(); i++) {
            if (internList.get(i).getLastName().contains(keyword) || internList.get(i).getFirstName().contains(keyword)) {
                searchList.add(internList.get(i));
            }
        }
        return searchList;
    }
}
