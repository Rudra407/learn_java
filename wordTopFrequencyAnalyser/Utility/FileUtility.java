package tech.codingclub.wordTopFrequencyAnalyser.Utility;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class FileUtility {

    public static ArrayList<String> readAndPrint(String fileName) {
        Scanner sc = null;
        ArrayList<String> arr = new ArrayList<String>();
        try {
            File file = new File(fileName);
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                arr.add(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
        return arr;
    }
}