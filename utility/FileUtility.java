package tech.codingclub.utility;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class FileUtility {

    public static boolean createFile(String fileNameWithPath) {
        File file = new File(fileNameWithPath);
        boolean fileCreated = false;

        try {
            fileCreated = file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return fileCreated;
    }

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

    public static boolean appendToFile(String fileName, String content){
        try{
            FileWriter fw = new FileWriter(fileName, true);
            fw.append(content);
            fw.append("\n");
            fw.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
        return true;
    }
    public static boolean writeToFile(String fileNameWithPath, String content) {
        BufferedWriter bw = null;
        try {
            File file = new File(fileNameWithPath);

            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            bw = new BufferedWriter(fw);
            bw.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {


        System.out.println("This is Rudra Dev Mishra");
        System.out.println("Running File Utility at  " + new Date().toString() + " sharp");

        String nameOfFile = "/home/rudradevmishra/IdeaProjects/CodingClubBackend/data/practice/file/" + "createFile.txt";
        Boolean created = createFile(nameOfFile);
        System.out.println("File Created : " + created);
        ArrayList<String> arr = readAndPrint(nameOfFile);
        for (String str : arr) {
            System.out.println(str);
        }
        System.out.println("No of lines in file " + arr.size());
        String nameOfWriteFIle = "/home/rudradevmishra/IdeaProjects/CodingClubBackend/data/practice/file/" + "writeFile.txt";
        Boolean wroteToFile = writeToFile(nameOfWriteFIle, "This is great Content ");
        System.out.println(wroteToFile);

        for(int i=0;i<=100;i++){
            String data = "" + i;
            appendToFile(nameOfWriteFIle,data);
        }

        System.out.println("Appended File length " + readAndPrint(nameOfWriteFIle).size());
    }

};