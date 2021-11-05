package case_study_module2.Service.Interface;

import java.util.List;

public interface BookingService<E>{
    List<E> read();

    void addNew();

    void show();

    void create();

    void showListContract();

    void update();
}
