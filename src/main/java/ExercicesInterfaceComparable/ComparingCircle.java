package ExercicesInterfaceComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparingCircle {
    public static void main(String[] args) {
        int numCircles = 6;

        List<Circle> circles = new ArrayList<>();

        for (int i = 0; i < numCircles; i++) {
            circles.add(new Circle());
        }
        System.out.println("Circles before ordering:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
        Collections.sort(circles);

        System.out.println("\nRectangles after sorting by radius:");
        //System.out.println("\nRectangles after sorting by area:");
        //System.out.println("\nRectangles after sorting by perimeter:");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
