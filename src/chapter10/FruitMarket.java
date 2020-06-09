package chapter10;

public class FruitMarket {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        apple.makeJuice();
        ((Apple)apple).removeSeeds();
        System.out.println(apple.getCalories());

        Apple apple2 = new Apple();
        apple.makeJuice();
        apple2.removeSeeds();
        System.out.println(apple2.getCalories());

        Fruit lemon = new Lemon();
        lemon.makeJuice();
        ((Lemon)lemon).peel();
        System.out.println(lemon.getCalories());

        squeeze(apple);
        squeeze(apple2);
        squeeze(lemon);
    }

    public static void squeeze(Fruit fruit){
        System.out.println("Squeezing....");
        fruit.makeJuice();
    }
}
