package review_oop.ex_4.service;

import review_oop.ex_4.model.Fresher;
import review_oop.ex_4.repository.FresherRepository;

import java.util.List;

public class FresherServiceImpl implements ICandidateService<Fresher> {
    private FresherRepository fresherRepository = new FresherRepository();

    @Override
    public void addCandidate(Fresher fresher) {
        fresherRepository.add(fresher);
    }

    @Override
    public List<Fresher> searchCandidate(String nameCandidate) {
        return fresherRepository.search(nameCandidate);
    }

    @Override
    public List<Fresher> getAll() {
        return fresherRepository.getAll();
    }

    @Override
    public Fresher findById(int id) {
        return fresherRepository.findById(id);
    }

    @Override
    public void update(int id, Fresher fresher) {
        fresherRepository.update(id, fresher);
    }

    @Override
    public void deleteById(int id) {
        fresherRepository.delete(id);
    }
}
