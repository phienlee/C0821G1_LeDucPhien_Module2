package review_oop.ex_4.common;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile<E> {
    private static final String SOURCE_PATH = "module_2/src/review_oop/ex_4/data/";

    public List<String[]> readFromFile(String fileName) {
        List<String[]> list = new ArrayList<>();
        File file = new File(SOURCE_PATH + fileName);
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line.split(","));
            }
        } catch (IOException e) {
            System.out.println("Error in reading.");
            e.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    public void writeToFile(String fileName, List<E> list, boolean writeMode) {
        File file = new File(SOURCE_PATH + fileName);
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedWriter = new BufferedWriter(new FileWriter(file, writeMode));
            for (E e : list) {
                bufferedWriter.write(e.toString());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error in writing.");
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
