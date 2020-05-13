package chapter4;

import java.util.Scanner;

public class ReverseString {

    public static void main(String[] args) {
        String input;
        String reversedInput="";
        char tmp;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please fill in a sentence you want to reverse.");
        input = scanner.nextLine();
        scanner.close();

        for (int i = input.length()-1; i >= 0 ; i--) {
            tmp = input.charAt(i);
            reversedInput+= tmp;
        }

        System.out.println(reversedInput);
    }
}
