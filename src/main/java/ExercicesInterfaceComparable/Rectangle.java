package ExercicesInterfaceComparable;

import java.util.Random;

public class Rectangle implements Comparable<Rectangle>{
    private double width = 0;
    private double length = 0;

    private int id ;
    private static int nextId = 0;

    private static int numberComparisons = 0;

    public Rectangle(){
        Random random = new Random();
        this.width =  1 + random.nextDouble();
        this.length = 1 + random.nextDouble();
        id = nextId++;
    }
    @Override
    public int compareTo(Rectangle otherRectangle) {

        System.out.println("Comparing rectangle number: " + this.id + ", with rectangle: " + otherRectangle.id );

        numberComparisons++;

        System.out.println("Cuantas comparaciones " + numberComparisons);

        //return Double.compare(this.width, otherRectangle.width);
        //return Double.compare(this.length, otherRectangle.length);
        return Double.compare(this.area(), otherRectangle.area());
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double area() { return width * length; }

    public double perimeter() {
        return 2 * (width + length);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "id=" + id +
                ", width=" + width +
                ", length=" + length +
                ", area=" + area() +
                '}';
    }
}

