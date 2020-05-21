package chapter7;

import java.util.Scanner;
/*
 * Create a program that allows a user to enter any
 * number of grades and provides them with their
 * average score, as well as the highest and lowest scores.
 */

public class DayOfTheWeek {
    static String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Thursday",
            "Friday", "Saturday", "Sunday"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert a number to match a weekday (1-7)");
        int day = scanner.nextInt();
        System.out.println(matchWeekDay(day));
        scanner.close();
    }

    public static String matchWeekDay(int index) {
        return weekDays[index-1];
    }
}
