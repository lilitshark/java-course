package CoinTossGame;

import java.util.Scanner;

public class CoinTossGame {

    public static void main(String[] args) {
        Player player1 = new Player("Lilit");
        Player player2 = new Player("Henk");

        //Player firstPlayer = chooseFirstPlayer(player1, player2);
        chooseCoinSide(player1, player2);

        System.out.println("Flipping the coin...");
        Coin coin = new Coin();
        String coinSide = coin.flip();

        Player winner  = decideWinner(coinSide, player1, player2);

        System.out.println("The winner is... " + winner.getName() + "!!!");

    }

/*    public static Player chooseFirstPlayer(Player player1, Player player2){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Who will play first?");
        String firstPlayer = scanner.nextLine();

        if(firstPlayer == player1.getName()){
            return player1;
        }
        else
            return player2;
    }*/

    public static void chooseCoinSide(Player player1, Player player2){
        Scanner scanner = new Scanner(System.in);
        String playerChoice = "";
        System.out.println("Please select Tail or Head:");
        player1.setChoice(scanner.nextLine());

        /*if(firstPlayer.getName() == player1.getName()) {
            player1.setChoice(scanner.nextLine());
            playerChoice = player1.getChoice();
        }
        else if(firstPlayer.getName() == player2.getName()) {
            player2.setChoice(scanner.nextLine());
            playerChoice = player2.getChoice();
        }
        else
            System.out.println("Wrong player's name");*/


        if(player1.getChoice().equalsIgnoreCase("Head")) {
            player1.setChoice("Head");
            player2.setChoice("Tail");
        }
        else if(player1.getChoice().equalsIgnoreCase("Tail")) {
            player1.setChoice("Tail");
            player2.setChoice("Head");
        }
        else{
            System.out.println("Input type is not valid!");
        }
    }

    public static Player decideWinner(String coinSide, Player player1, Player player2){
        if(coinSide.equalsIgnoreCase(player1.getChoice())){
            return player1;
        }
        else
            return player2;
    }
}
