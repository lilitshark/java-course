package chapter8;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PasswordValidator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter username");
        String username = scanner.next();
        System.out.println("Please enter old password");
        String oldPassword = scanner.next();
        System.out.println("Please enter new password");
        String newPassword = scanner.next();
        scanner.close();

        boolean isValid = validatePassword(username, oldPassword, newPassword);
        if(isValid)
            System.out.println("Congrats the new password is valid!");
        else
            System.out.println("New password is invalid! Try again!");
    }

    public static boolean validatePassword(String username, String oldPassword, String newPassword){
        String specialChars = "~`!@#$%^&*()-_=+\\|[{]};:'\",<.>/?";
        int minCharacter = 8;
        //Pattern pattern = Pattern.compile("[^a-z0-9]", Pattern.CASE_INSENSITIVE);
        boolean uppercasePresent = false;
        boolean specialCharPresent = false;


        if (newPassword.length() >= minCharacter && !newPassword.contains(oldPassword)
                && !newPassword.contains(username) ){
            for (int i = 0; i < newPassword.length(); i++) {
                char currentCharacter = newPassword.charAt(i);
                if(Character.isUpperCase(currentCharacter)){
                    uppercasePresent = true;
                    continue;
                }
                else if(specialChars.contains(String.valueOf(currentCharacter))){
                    specialCharPresent = true;
                    continue;
                }
            }
            return uppercasePresent && specialCharPresent;
        }
        else return false;
    }
}
