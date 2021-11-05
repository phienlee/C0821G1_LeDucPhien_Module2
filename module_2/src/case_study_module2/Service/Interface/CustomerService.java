package case_study_module2.Service.Interface;

import java.util.List;

public interface CustomerService<E> {
    List<E> read();

    void show();

    void searchById();

    List<E> create();

    void add();

    void update();

    void delete();

}
