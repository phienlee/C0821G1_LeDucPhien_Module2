package case_study_module2.Service.Interface;

import java.util.List;

public interface FacilityService<E> {
    void showList();

    List<E> addNewList();

    void showListFacility();
}
