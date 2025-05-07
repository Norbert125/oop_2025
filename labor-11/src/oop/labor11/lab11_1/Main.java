package oop.labor11.lab11_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        for (int i = 10; i <= 1000000; i*=10) {
            String DataFileName = "data"+i+".txt";
            for (int j = 10; j <= 10000000; j*=10) {
                String updateFileName = "update"+j+".txt";
                if (checkFile(DataFileName) && checkFile(updateFileName)){
                    System.out.println("dataFile: " + DataFileName + " UpdateFile " + updateFileName + " " + doIt(DataFileName, updateFileName));
                }
            }
            System.out.println();
        }

    }

    private static boolean checkFile(String fileName){
        try (Scanner scanner = new Scanner(new File(fileName))){
            return true;
        }catch (FileNotFoundException e){
            return false;
        }
    }

    private static long doIt(String dataFile, String updateFile){
        long start = System.currentTimeMillis();
        Storage storage = new Storage(dataFile);
        System.out.println(storage.update(updateFile));
        long end = System.currentTimeMillis();
        return end - start;
    }

}