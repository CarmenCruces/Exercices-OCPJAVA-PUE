package ExercicesInterfaceComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparingRectangle {
    public static void main(String[] args) {
        int numRectangles = 50;

        //List is more dynamic, but if we know the exact number of
        //rectangles that are going to be in the array
        //we can use this........Rectangle[] rectangles = new Rectangle[numRectangles];
        List<Rectangle> rectangles = new ArrayList<>();

        // Filling the list with rectangles
        for (int i = 0; i < numRectangles; i++) {
            rectangles.add(new Rectangle());
        }

        // Print rectangles before ordering
        System.out.println("Rectangles before ordering:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }

        // Sort rectangles using the Comparable interface
        Collections.sort(rectangles);

        // Print rectangles after sorting by area
        System.out.println("\nRectangles after sorting by area:");
        for (Rectangle rectangle : rectangles) {
            System.out.println(rectangle);
        }
    }
}
