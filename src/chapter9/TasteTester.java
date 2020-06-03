package chapter9;

public class TasteTester {

    public static void main(String[] args) {
        Cake cake = new Cake();
        cake.setPrice(54);
        System.out.println("Cake price is $" + cake.getPrice());

        BirthdayCake birthdayCake = new BirthdayCake();
        birthdayCake.setFlavour("Strawberry");
        birthdayCake.setPrice(74);
        birthdayCake.setCandles(1);

        System.out.println(String.format("Birthday cake price is $" + birthdayCake.getPrice() + " with "
                + birthdayCake.getFlavour() + " flavour and " + "candles " + birthdayCake.getCandles()) );

        WeddingCake weddingCake = new WeddingCake(4);
        System.out.println("Wedding cake has " + weddingCake.getTiers() + " tiers");

    }
}
