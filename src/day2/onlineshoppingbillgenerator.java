package day2;
import java.util.Scanner;

public class onlineshoppingbillgenerator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter customer name:");
        String customerName = sc.nextLine();

        System.out.println("Enter product name:");
        String productName = sc.nextLine();

        System.out.println("Enter product price:");
        int price = sc.nextInt();

        System.out.println("Enter quantity:");
        int quantity = sc.nextInt();

        int totalBill = price * quantity;

        System.out.println("Customer Name: " + customerName);
        System.out.println("Product: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Bill: " + totalBill);

	}

}
