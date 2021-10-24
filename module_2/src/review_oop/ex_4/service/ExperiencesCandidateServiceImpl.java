package review_oop.ex_4.service;

import review_oop.ex_4.model.ExperienceCandidate;
import review_oop.ex_4.repository.ExperienceRepository;

import java.util.List;

public class ExperiencesCandidateServiceImpl implements ICandidateService<ExperienceCandidate> {
    private ExperienceRepository experienceRepository = new ExperienceRepository();


    @Override
    public void addCandidate(ExperienceCandidate experienceCandidate) {
        experienceRepository.add(experienceCandidate);
    }

    @Override
    public List<ExperienceCandidate> searchCandidate(String nameCandidate) {
        return experienceRepository.search(nameCandidate);
    }

    @Override
    public List<ExperienceCandidate> getAll() {
        return experienceRepository.getAll();
    }

    @Override
    public ExperienceCandidate findById(int id) {
        return null;
    }

    @Override
    public void update(int id, ExperienceCandidate experienceCandidate) {
        experienceRepository.update(id, experienceCandidate);
    }

    @Override
    public void deleteById(int id) {
        experienceRepository.delete(id);
    }
}
