package chapter4;

import java.util.Random;

public class RollTheDieGame {

    public static void main(String[] args) {
        int maxNumberOfSpaces = 20;
        int currentSpace = 0;
        int numberOfDie = 5;
        Random random = new Random();

        for (int i = 0; i < numberOfDie; i++) {

            int die = random.nextInt(6) + 1;
            currentSpace = currentSpace + die;

            if(currentSpace > 20){
                System.out.println("Roll#" + (i+1) + ". You have rolled a " + die
                        + ". Unfortunately, that takes you past 20 spaces.");
                break;
            }

            System.out.println("Roll#" + (i+1) + ". You have rolled a " + die
                    + ". You are now on space " + currentSpace + " and have "
                    + (maxNumberOfSpaces - currentSpace) + " to go.");

            if (currentSpace == 20){
                System.out.println("You Won!!");
                break;
            }
        }

        if(currentSpace > 20 || currentSpace <20){
            System.out.println("You lost!");
        }
    }
}
