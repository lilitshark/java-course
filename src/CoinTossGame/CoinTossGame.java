package CoinTossGame;

import java.util.Scanner;

public class CoinTossGame {
    private Scanner scanner;

    public static void main(String[] args) {
        CoinTossGame game = new CoinTossGame();
        game.scanner = new Scanner(System.in);

        Player player1 = new Player(game.askPlayerName());
        Player player2 = new Player(game.askPlayerName());

        game.chooseCoinSide(player1, player2);

        System.out.println("Flipping the coin...");
        Coin coin = new Coin();
        coin.flip();

        Player winner  = game.decideWinner(coin, player1, player2);

        System.out.println("The winner is... " + winner.getName() + "!!!");

        game.scanner.close();
    }

    /**
     * Returns String input that player types in the console which can be assigned to the player's name
     * @return    inserted player's name
     */
    public String askPlayerName(){
        System.out.println("Please enter player's name");
        return scanner.nextLine();
    }

    /**
     * This method will ask player1 to choose the coin side, will validate the input and only then
     * assign the opposite site to player2's choice
     * @param player1   the first player according to user's input sequence
     * @param player2   the second player according to user's input sequence
     */
    public void chooseCoinSide(Player player1, Player player2){

        do {
            System.out.println("First player, please select Tail or Head:");
            player1.setChoice(scanner.nextLine());
        }while(!player1.getChoice().equalsIgnoreCase(Coin.HEAD) && !player1.getChoice().equalsIgnoreCase(Coin.TAIL));

        if(player1.getChoice().equalsIgnoreCase(Coin.HEAD)) {
            player2.setChoice(Coin.TAIL);
        }
        else
            player2.setChoice(Coin.HEAD); //the program will reach to this point when value of player1.getChoice() is "Tail"
    }

    /**
     * This method will calculate the winner of the game given the result of flipping the coin
     * @param coin       the coin that will be flipped for the game
     * @param player1    the first player according to user's input sequence
     * @param player2    the second player according to user's input sequence
     * @return
     */
    public Player decideWinner(Coin coin, Player player1, Player player2){
        if(coin.getSide().equalsIgnoreCase(player1.getChoice())){
            return player1;
        }
        else
            return player2;
    }
}
