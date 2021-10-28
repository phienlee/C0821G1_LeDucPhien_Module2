package _15_io_binary_file.exercise.write_read_file;

import _15_io_binary_file.exercise.model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriterAndReaderFunc {
    private static final String PATH = "D:\\C0821G1_LeDucPhien_Module2\\module_2\\src\\_15_io_binary_file\\exercise\\data\\product.txt";
    public void writeToFile(List<Product> list) throws IOException {
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream(PATH));
            oos.writeObject(list);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            oos.close();
        }
        System.out.println("success...");
    }

    public List<Product> readFromFile() throws IOException {
        ObjectInputStream ois = null;
        List<Product> productList = new ArrayList<>();
        try {
            ois = new ObjectInputStream(new FileInputStream(PATH));
            productList = (List<Product>) ois.readObject();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        } finally {
            ois.close();
        }
        return productList;
    }
}
