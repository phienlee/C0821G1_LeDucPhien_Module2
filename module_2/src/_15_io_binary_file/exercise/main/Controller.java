package _15_io_binary_file.exercise.main;

import _15_io_binary_file.exercise.manage.ProductManage;
import _15_io_binary_file.exercise.model.Product;
import _15_io_binary_file.exercise.write_read_file.WriterAndReaderFunc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    Scanner scanner = new Scanner(System.in);
    ProductManage productManager = new ProductManage();


    public static void main(String[] args) throws IOException {
        Product product = new Product("11", "11", "11", "11", 11);
        Product product1 = new Product("111", "111", "111", "111", 111);
        List<Product> productList=new ArrayList<>();
        productList.add(product);
        productList.add(product1);
        Controller controller = new Controller();
        controller.displayMainMenu ();
        WriterAndReaderFunc writerAndReaderFunc = new WriterAndReaderFunc();
        List<Product> list = writerAndReaderFunc.readFromFile();
        for (Product listFile : list) {
            System.out.println(listFile);
        }
        writerAndReaderFunc.writeToFile(list);
    }

    public void displayMainMenu() throws IOException {
        System.out.println("--Main-Menu---\n" +
                "1.Add product\n" +
                "2.Show info product\n" +
                "3.Search by product name\n" +
                "0.Exit");
        System.out.println("-----------------");
        System.out.println("Please choose: ");
        String choose = null;
        boolean exit = false;

        while (true) {

            choose = scanner.nextLine();
            switch (choose) {
                case "1":
                    productManager.add();
                    break;
                case "2":
                    productManager.show();
                    break;
                case "3":
                    productManager.search();
                    break;
                case "0":
                    System.out.println("exited!");
                    exit = true;
                    break;
                default:
                    System.out.println("invalid! please choose action in below menu:");
                    break;
            }
            if (exit) {
                break;
            }
            displayMainMenu();
        }
    }

}
