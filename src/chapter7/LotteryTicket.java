package chapter7;

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args) {
        int[] ticket = generateLotteryNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateLotteryNumbers(){
        int[] ticket = new int[6];
        Random random = new Random();

        for (int i = 0; i < LENGTH; i++){
            int randomNumber;
            /*Generate a random number, then search if it already exists in the array. If it does, regenerate another
            random number and search again.*/
            do {
                randomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1; //The bound number is not inclusive
            } while(searchNumberInArray(ticket, randomNumber));

            ticket[i] = randomNumber; //Assign a unique number to the ticket
        }

        return ticket;
    }

    //TODO use this method
    public static boolean binarySearch(int[] array, int numberToSearchFor){
        Arrays.sort(array);
        int index = Arrays.binarySearch(array, numberToSearchFor);

        if(index >= 0){
            return true;
        }
        else return false;
    }

    public static boolean searchNumberInArray(int[] array, int numberToSearchFor){

        for(int value:array) {
            if(value == numberToSearchFor)
                return true;
        }
        return false;
    }

    public static void printTicket(int[] ticket){
        int i = 0;
        while (i < LENGTH) {
            System.out.print(ticket[i] + " | ");
            i++;
        }
        //IntStream.range(0, LENGTH).mapToObj(i -> ticket[i] + " | ").forEach(System.out::print);
    }

}
