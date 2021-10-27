package _14_io_text_file.exercise.copy_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
    private static final String PATH_SOURCE_FILE = "D:\\C0821G1_LeDucPhien_Module2\\module_2\\src\\_14_io_text_file\\exercise\\copy_file";
    private static final String PATH_TARGET_FILE = "D:\\C0821G1_LeDucPhien_Module2\\module_2\\src\\_14_io_text_file\\exercise\\";

    public static List<String> readFromFile(String fileName) {
        List<String> list = new ArrayList<>();
        File file = new File(PATH_SOURCE_FILE + fileName);
        BufferedReader bufferedReader = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                list.add(line);
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

    public static void writeToFile(String fileName, List<String> list, boolean writeMode) {
        File file = new File(PATH_TARGET_FILE + fileName);
        BufferedWriter bufferedWriter = null;
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            bufferedWriter = new BufferedWriter(new FileWriter(file, writeMode));
            for (String string : list) {
                bufferedWriter.write(string, 0, string.length());
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

    public static void main(String[] args) throws IOException {
        List<String> list = readFromFile("sourceFile.txt");
        for (String listFile : list) {
            System.out.println(listFile);
        }
        writeToFile("targetFile.txt", list , false);
    }
}

