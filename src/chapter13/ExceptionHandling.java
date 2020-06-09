package chapter13;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        divideByZero();
        numberExceptionHandling();

        try {
            numberExceptionHandlingRethrow();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void divideByZero(){
        try {
            int c = 30 / 0;
        }catch (Exception e) {
            System.out.println("Diving by 0 is not allowed");
        }finally {
            System.out.println("Dividing is fun!");
        }
    }

    public static void numberExceptionHandling(){
        File file = new File("resources/numbers.txt");
        Scanner fileReader = null;
        try {
            fileReader = new Scanner(file);

            while (fileReader.hasNext()) {
                double num = fileReader.nextDouble();
                System.out.println("Number is " + num);
            }
        } catch (FileNotFoundException | InputMismatchException e) {
            System.out.println("File has not been found");
            e.printStackTrace();
        } finally {
            fileReader.close();
        }
    }

    public static void numberExceptionHandlingRethrow() throws FileNotFoundException{
        File file = new File("resources/numbers.txt");
        Scanner fileReader = new Scanner(file);

        while (fileReader.hasNext()) {
            double num = fileReader.nextDouble();
            System.out.println("Number is " + num);
        }

        fileReader.close();
    }
}
