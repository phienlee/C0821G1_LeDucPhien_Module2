package case_study_module2.Service.Impl;

import case_study_module2.Commons.ReadAndWriteFile;
import case_study_module2.Models.Customer;
import case_study_module2.Service.Interface.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService<Customer> {
    ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
    Scanner scanner = new Scanner(System.in);

    @Override
    public List<Customer> read() {
        return null;
    }

    @Override
    public void show() {

    }

    @Override
    public void searchById() {

    }

    @Override
    public List<Customer> create() {
        return null;
    }

    @Override
    public void add() {

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
