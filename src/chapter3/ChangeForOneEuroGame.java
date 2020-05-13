package chapter3;

import java.util.Scanner;

public class ChangeForOneEuroGame {
    public static void main(String[] args) {
        double oneCent = 0.01;
        double twoCent = 0.02;
        double fiveCent = 0.05;
        double tenCent = 0.1;
        double twentyCent = 0.2;
        double fiftyCent = 0.5;
        double total;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter how many 1 cents you have: ");
        oneCent = 0.01 * scanner.nextInt();
        System.out.println("Please enter how many 2 cents you have: ");
        twoCent = 0.02 * scanner.nextInt();
        System.out.println("Please enter how many 5 cents you have: ");
        fiveCent = 0.05 * scanner.nextInt();
        System.out.println("Please enter how many 10 cents you have: ");
        tenCent = 0.1 * scanner.nextInt();
        System.out.println("Please enter how many 20 cents you have: ");
        twentyCent = 0.2 * scanner.nextInt();
        System.out.println("Please enter how many 50 cents you have: ");
        fiftyCent = 0.5 * scanner.nextInt();

        total = oneCent + twoCent + fiveCent + tenCent + twentyCent + fiftyCent;
        //total = total / 100;

        if (total == 1){
            System.out.println("You won!!");
        }
        else if (total < 1){
            System.out.println(String.format("You lost! You are under 1$ by %.0f cents", (1-total)*100));
        }
        else if (total > 1){
            System.out.println(String.format("You lost! You are over 1$ by %.0f cents", (total-1)*100));
        }
    }
}
