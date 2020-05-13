package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator{

    public static void main(String[] args) {
        double planFee;
        double overageMinutes;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your plan fee");
        planFee = scanner.nextDouble();

        System.out.println("Please enter the number of  overage minutes");
        overageMinutes = scanner.nextDouble();

        scanner.close();

        double overageFee = calculateOverageFee(overageMinutes);
        double taxAmount = calculateTax(overageFee + planFee);

        calculateAndPrintBill(planFee, overageFee, taxAmount);

    }
    public static double calculateOverageFee(double extraMinutes){
        double minRate = 0.25;
        return (extraMinutes*minRate);
    }

    public static double calculateTax(double subtotal){
        double taxRate = 0.15;
        return subtotal*taxRate;
    }

    public static void calculateAndPrintBill(double planFee, double overageFee, double taxAmount){
        double finalTotal = overageFee + planFee + taxAmount;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: $" + planFee);
        System.out.println("Overage: $" + overageFee);
        System.out.println("Tax: $" + taxAmount);
        System.out.println("Total: $" + finalTotal);
    }
}
