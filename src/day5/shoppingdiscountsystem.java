package day5;
import java.util.Scanner;

public class shoppingdiscountsystem {


    public static double calculateBill(double billAmount, double discountPercent) {
        double discountAmount = billAmount * discountPercent / 100;
        return billAmount - discountAmount;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Bill Amount: ");
        double bill = sc.nextDouble();

        System.out.print("Enter Discount Percentage: ");
        double discount = sc.nextDouble();

        double finalBill = calculateBill(bill, discount);

        System.out.println("Final Bill: " + finalBill);
    }
}

