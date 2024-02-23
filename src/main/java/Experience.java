import java.util.Scanner;

public class Experience {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of months of work experience:");
        int monthsOfExperience = scanner.nextInt();

        double yearsOfExperience = (double) monthsOfExperience / 12;

        boolean motivation = true;
        boolean willingness = true;
        boolean solidKnowledge = true;

        System.out.println("Send technical task to both candidates.");

        if (yearsOfExperience >= 1) {
            if (solidKnowledge) {
                System.out.println("Evaluate the candidate with more experience based on best practices.");
            } else {
                System.out.println("The candidate with more experience does not meet the requirements. " +
                        "Further evaluation may be needed.");
            }
        } else {

            if (motivation && willingness) {
                System.out.println("Evaluate the candidate with less experience based on potential.");
            } else {
                System.out.println("The candidate with less experience does not meet the requirements. " +
                        "No need for further evaluation.");
            }
        }
        scanner.close();
    }
}


