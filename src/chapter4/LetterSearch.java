package chapter4;

import java.util.Scanner;

/*
 * LOOP BREAK
 * Search a String to determine if it contains the letter 'A'.
 * The method looks for 'A' letter in a sentence you input
 * and counts how many letter 'A' there is
 */
public class LetterSearch {

    public static void main(String[] args) {
        Boolean letterFound = false;
        int count = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a text");
        String input = scanner.nextLine();

        scanner.close();

        for (int i = 0; i < input.length(); i++) {
            char currentLetter = input.charAt(i);
            //System.out.println(currentLetter);
            if(currentLetter == 'A' || currentLetter=='a'){
                letterFound = true;
                count++;
            }
        }

        if(letterFound == true){
            System.out.println("There is letter 'A' in your input!");
            System.out.println("'A' letter happens " + count + " time(s) in your input");
        }
        else
            System.out.println("There is no letter 'A' in your input");

    }
}
