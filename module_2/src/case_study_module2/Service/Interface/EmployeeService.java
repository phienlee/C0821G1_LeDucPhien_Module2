package case_study_module2.Service.Interface;

import java.util.List;

public interface EmployeeService<E> {
    List<E> read();

    void show();

    void add();

    void update();
}
