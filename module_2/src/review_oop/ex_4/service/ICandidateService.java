package review_oop.ex_4.service;

import review_oop.ex_4.model.Intern;

import java.util.List;

public interface ICandidateService<E> {
    void addCandidate(E e);

    List<E> searchCandidate(String nameCandidate);

    List<E> getAll();

    E findById(int id);

    void update(int id, E e);

    void deleteById(int id);
}
