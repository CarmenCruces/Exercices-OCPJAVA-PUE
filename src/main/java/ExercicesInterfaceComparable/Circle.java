package ExercicesInterfaceComparable;

import java.util.Random;

public class Circle implements Comparable<Circle>{
    float radius = 0;

    public Circle() {
        Random random = new Random();
        this.radius = 1 + random.nextFloat();;
    }
    @Override
    public int compareTo(Circle otherCircle) {
        return Float.compare(this.radius,otherCircle.radius);
        //return Double.compare(this.area(),otherCircle.area());
        //return Double.compare(this.perimeter(),otherCircle.perimeter());

    }

    public float getRadius() {
        return radius;
    }
    public void setRadius(float radius) {
        this.radius = radius;
    }
    public double area() { return Math.PI * Math.pow(radius, 2);}
    public double perimeter() { return 2 * Math.PI * radius; }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                "area=" + area() +
                "perimeter=" + perimeter() +
                '}';
    }
}
