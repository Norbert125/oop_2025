package oop.labor09.lab9_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListDictionary implements IDictionary {
    private ArrayList<String> words = new ArrayList<>();
    public ArrayListDictionary(){
        try (Scanner scanner = new Scanner(new File(DICTIONARY_FILE))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    @Override
    public boolean add(String word) {
        if(find(word)) {return false;}
        this.words.add(word);
        return true;
    }

    @Override
    public boolean find(String word) {
        return Collections.binarySearch(words,word) >= 0;
        //return this.words.contains(word);
    }

    @Override
    public int size() {
        return this.words.size();
    }
}
