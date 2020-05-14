package chapter6;

import java.util.Scanner;

public class PhoneBill {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your Bill ID");
        int id = scanner.nextInt();
        System.out.println("How many minutes did you use?");
        double minutesUsed = scanner.nextDouble();
        scanner.close();

        //PhoneBillCalculatorRedo phoneBill = new PhoneBillCalculatorRedo();
        //PhoneBillCalculatorRedo phoneBill = new PhoneBillCalculatorRedo(id);
        PhoneBillCalculatorRedo phoneBill = new PhoneBillCalculatorRedo(id, minutesUsed);

        phoneBill.PrintBill();
    }
}


