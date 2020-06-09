package chapter10;

public class Lemon extends Fruit {

    public Lemon(){
        setCalories(40);
    }

    public void peel(){
        System.out.println("The lemon is peeled");
    }

    @Override
    public void makeJuice(){
        System.out.println("Lemon juice is made!");
    }
}
