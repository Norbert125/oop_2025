package oop.labor11.lab11_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Storage {
    ArrayList<Product> products = new ArrayList<>();

    public Storage(String fileName) {
        try (Scanner scanner = new Scanner(new File(fileName))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                Product product = new Product(Integer.parseInt(words[0].strip()),Integer.parseInt(words[2].strip()),Integer.parseInt(words[3].strip()),words[1].strip());
                products.add(product);
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        Collections.sort(products, (Product p1, Product p2) -> {return p1.getId() - p2.getId();});
    }

    public int update(String fileName){
        int counter = 0, i = 0;
        try (Scanner scanner = new Scanner(new File(fileName))){
            while (scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] words = line.split(" ");
                int index = Collections.binarySearch(products,new Product(Integer.parseInt(words[0].strip()),0,0,""), Comparator.comparing(Product::getId));
                if(index < 0) {i++;continue;}
                products.get(i).increaseAmount(Integer.parseInt(words[1].strip()));
                counter++; i++;
            }

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return counter;
    }


}
