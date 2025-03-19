package lab2_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[10];
        Random rand = new Random();
        double totalArea = 0;
        for (int i = 0; i < rectangles.length; i++) {
            int length = rand.nextInt(10) + 1;
            int width = rand.nextInt(10) + 1;
            rectangles[i] = new Rectangle(length, width);
            System.out.println("Rectangle{" +
                    "length : " + rectangles[i].getLength() +
                    " width: " + rectangles[i].getWidth() +
                    " area: " + rectangles[i].Area() +
                    " perimeter: " + rectangles[i].Perimeter() +"}");
            totalArea += rectangles[i].Area();
        }
        System.out.println("Total area: " + totalArea);

    }
}
