package chapter10;

public class Apple extends Fruit {

    public Apple(){
        setCalories(80);
    }

    @Override
    public void makeJuice(){
        //super.makeJuice();
        System.out.println("Apple juice is made!");
    }

    public void removeSeeds(){
        System.out.println("Seeds are removed");
    }
}
