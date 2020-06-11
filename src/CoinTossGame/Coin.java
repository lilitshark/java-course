package CoinTossGame;

import java.util.Random;

public class Coin {
    public final static String HEAD = "HEAD";
    public final static String TAIL = "TAIL";
    private String side;

    public void setSide(String side){
        this.side = side;
    }

    public String getSide(){
        return side;
    }

    public String flip(){
        Random random = new Random();

        if(random.nextBoolean()){
            setSide(HEAD);
            System.out.println("The coin landed on " + HEAD);
        }
        else{
            setSide(TAIL);
            System.out.println("The coin landed on " + TAIL);
        }
        return getSide();
    }
}
