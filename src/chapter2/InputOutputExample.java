package chapter2;

import java.util.Scanner;

public class InputOutputExample {

    public static void main(String arg[]){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a season of a year:");
        String season = scanner.next();

        System.out.println("Enter a whole number:");
        int number = scanner.nextInt();

        System.out.println("Enter an adjective:");
        String adjective = scanner.next();

        scanner.close();

        System.out.println("On a " + adjective + " " + season +
                " day, I drink a minimum of " + number + " cups of coffee.");
    }
}
