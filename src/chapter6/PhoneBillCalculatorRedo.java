package chapter6;

public class PhoneBillCalculatorRedo {
    private int id;
    private double baseCost = 2;
    private double freeMinutes;
    private double minutesUsed;

    public PhoneBillCalculatorRedo(){
        id = 1234;
        baseCost = 2;
        freeMinutes = 50;
        minutesUsed = 60;
    }

    public PhoneBillCalculatorRedo(int id){
        this.id = id;
        baseCost = 2;
        freeMinutes = 50;
        minutesUsed = 80;
    }

    public PhoneBillCalculatorRedo(int id, double minutesUsed){
        this.id = id;
        baseCost = 2;
        freeMinutes = 50;
        this.minutesUsed = minutesUsed;
    }

    public double calculateOverage(){
        if(freeMinutes > minutesUsed)
            return 0;
        else
            return (minutesUsed - freeMinutes)*baseCost;
    }

    public double calculateTax(){
        double taxRate = 0.25;
        return calculateOverage() * taxRate;
    }

    public double calculateTotal(){
        return calculateOverage() + calculateTax();
    }

    public void PrintBill(){
        System.out.println("Phone Bill Statement #" + id);
        System.out.println("Overage: $" + calculateOverage());
        System.out.println("Tax: $" + calculateTax());
        System.out.println("Total: $" + calculateTotal());
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    public double getFreeMinutes() {
        return freeMinutes;
    }

    public void setFreeMinutes(double freeMinutes) {
        this.freeMinutes = freeMinutes;
    }

    public double getMinutesUsed() {
        return minutesUsed;
    }

    public void setMinutesUsed(double minutesUsed) {
        this.minutesUsed = minutesUsed;
    }
}
