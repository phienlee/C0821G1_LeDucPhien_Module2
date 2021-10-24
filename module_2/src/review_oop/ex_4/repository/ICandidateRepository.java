package review_oop.ex_4.repository;

import review_oop.ex_4.model.Intern;

import java.util.List;

public interface ICandidateRepository<E> {
    List<E> getAll();

    void add(E e);

    void delete(int id);

    void update(int id, E e);

    E findById(int id);

    List<E> search(String keyword);
}
