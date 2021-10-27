package _14_io_text_file.exercise.read_file_csv;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestCSV {
    private static final String FILE_PATH = "D:\\C0821G1_LeDucPhien_Module2\\module_2\\src\\_14_io_text_file\\exercise\\read_file_csv\\fileCSV.txt";

    public static List<String[]> readFromFile() {
        List<String[]> list = new ArrayList<>();
        File file = new File(FILE_PATH);
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line = "";
            String[] temp;
            while ((line = bufferedReader.readLine()) != null) {
                temp = line.split(",");
                list.add(temp);
            }
        } catch (IOException e) {
            System.out.println("Error in reading.");
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public static void main(String[] args) {
        List<String[]> strings = readFromFile();
        for (String[] list : strings) {
            System.out.println(Arrays.toString(list));
        }
    }
}
