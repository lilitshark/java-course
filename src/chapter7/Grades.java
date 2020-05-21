package chapter7;

import java.util.Scanner;

public class Grades {
    public static int[] grades;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("How many grades are you going to input?");
        grades = new int[scanner.nextInt()];

        getGrades();
        printGrades();
        System.out.println(String.format("Average grade is %.2f", calculateAverageGrade() ));
        System.out.println("Lowest grade is " + calculateLowestGrade());
        System.out.println("highest grade is " + calculateHighestGrade());
        scanner.close();
    }

    public static void getGrades(){
        for (int i = 0; i < grades.length; i++) {
            System.out.println("Please input a grade");
            grades[i] = scanner.nextInt();
        }
    }

    public static void printGrades(){
        for (int grade:grades) {
            System.out.println(grade + " | ");
        }
    }

    public static int calculateSum(){
        int sum = 0;
        for (int grade : grades) {
            sum = sum + grade;
        }
        return sum;
    }

    public static double calculateAverageGrade(){
        return (double)calculateSum() / grades.length;
    }

    public static int calculateLowestGrade(){
        int lowestGrade = grades[0];
        for (int grade : grades) {
            if(grade < lowestGrade)
                lowestGrade = grade;
        }
        return lowestGrade;
    }

    public static int calculateHighestGrade(){
        int highestGrade = grades[0];
        for (int grade : grades) {
            if(grade > highestGrade)
                highestGrade = grade;
        }
        return highestGrade;
    }
}