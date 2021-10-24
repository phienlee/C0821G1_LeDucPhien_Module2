package review_oop.ex_4.service;

import review_oop.ex_4.model.Intern;
import review_oop.ex_4.repository.InternRepository;

import java.util.List;

public class InternServiceImpl implements ICandidateService<Intern> {
    private InternRepository internRepository = new InternRepository();

    @Override
    public void addCandidate(Intern intern) {
        internRepository.add(intern);
    }

    @Override
    public List<Intern> searchCandidate(String nameCandidate) {
        return internRepository.search(nameCandidate);
    }

    @Override
    public List<Intern> getAll() {
        return internRepository.getAll();
    }

    @Override
    public Intern findById(int id) {
        return internRepository.findById(id);
    }

    @Override
    public void update(int id, Intern intern) {
        internRepository.update(id, intern);
    }

    @Override
    public void deleteById(int id) {
        internRepository.delete(id);
    }
}
