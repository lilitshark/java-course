package chapter4;

import java.util.Scanner;

public class AverageTotalScore {

    public static void main(String[] args) {
        int numberOfStudents = 2;
        int numberOfTests = 2;
        Scanner scanner = new Scanner(System.in);

        double average = 0;

        for (int i = 0; i < numberOfStudents; i++) {
            double total = 0;
            for (int j = 0; j < numberOfTests; j++) {
                System.out.println("Pleas input test score for Student " + (i+1) + " test#" + (j+1));
                total = total + scanner.nextDouble();
            }
            average = total / numberOfTests;
            System.out.println("Average for Student " + (i+1) + " is " + average);
        }
    }
}
