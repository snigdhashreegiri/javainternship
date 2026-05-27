package day2;
import java.util.Scanner;

public class ATMinformationsystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account holder name:");
        String name = sc.nextLine();

        System.out.println("Enter account balance:");
        double balance = sc.nextDouble();

        System.out.println("Enter withdrawal amount:");
        double withdrawal = sc.nextDouble();

        double remainingBalance = balance - withdrawal;

        boolean result = balance > withdrawal;

        System.out.println("Account Holder: " + name);
        System.out.println("Remaining Balance: " + remainingBalance);
        System.out.println("Balance greater than withdrawal: " + result);

    }
}
