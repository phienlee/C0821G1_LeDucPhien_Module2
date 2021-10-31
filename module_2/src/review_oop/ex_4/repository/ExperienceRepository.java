package review_oop.ex_4.repository;

import review_oop.ex_4.common.ReadAndWriteFile;
import review_oop.ex_4.model.ExperienceCandidate;
import review_oop.ex_4.model.Fresher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExperienceRepository implements ICandidateRepository<ExperienceCandidate> {
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();


    @Override
    public List<ExperienceCandidate> getAll() {
        List<ExperienceCandidate> experienceCandidateList = new ArrayList<>();
        List<String[]> list = readAndWriteFile.readFromFile("experience.csv");
        for (String[] strings : list) {
            ExperienceCandidate experienceCandidate = new ExperienceCandidate(strings);
            experienceCandidateList.add(experienceCandidate);
        }
        return experienceCandidateList;
    }

    @Override
    public void add(ExperienceCandidate experienceCandidate) {
        List<ExperienceCandidate> experienceCandidateList = getAll();
        experienceCandidateList.add(experienceCandidate);
        readAndWriteFile.writeToFile("experience.csv", experienceCandidateList, false);
    }

    @Override
    public void delete(int id) {
        List<ExperienceCandidate> experienceCandidateList = getAll();
        for (int i = 0; i < experienceCandidateList.size(); i++) {
            if (experienceCandidateList.get(i).getIdCandidate() == id) {
                experienceCandidateList.remove(i);
            }
        }
        readAndWriteFile.writeToFile("experience.csv", experienceCandidateList, false);
    }

    @Override
    public void update(int id, ExperienceCandidate experienceCandidate) {
        List<ExperienceCandidate> experienceCandidateList = getAll();
        for (int i = 0; i < experienceCandidateList.size(); i++) {
            if (experienceCandidateList.get(i).getIdCandidate() == id) {
                experienceCandidateList.set(i, experienceCandidate);
            }
        }
        readAndWriteFile.writeToFile("experience.csv", experienceCandidateList, false);
    }

    @Override
    public ExperienceCandidate findById(int id) {
        List<ExperienceCandidate> experienceCandidateList = getAll();
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
        List<ExperienceCandidate> experienceCandidates = getAll();
        for (int i = 0; i < experienceCandidates.size(); i++) {
            if (experienceCandidates.get(i).getLastName().contains(keyword) || experienceCandidates.get(i).getFirstName().contains(keyword)) {
                searchList.add(experienceCandidates.get(i));
            }
        }
        return searchList;
    }
}
