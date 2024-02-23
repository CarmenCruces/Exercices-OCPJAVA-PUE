package review.ExerciceRoots;

public class Exercise7roots {
    public static void main(String[] args) {
        Roots r1 = new Roots(1,6,9);
        Roots r2 = new Roots(4,10,2);
        Roots r3 = new Roots(4,2,9);

        System.out.println("r1");
        Solutions s1 = r1.calculate();
        System.out.println(s1);
        System.out.println("r2");
        Solutions s2 =  r2.calculate();
        System.out.println(s2);
        System.out.println("r3");
        Solutions s3 = r3.calculate();
        System.out.println(s3);
    }
}
