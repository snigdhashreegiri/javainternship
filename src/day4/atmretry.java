package day4;
import java.util.Scanner;
public class atmretry {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int pin;

        do {
            System.out.print("Enter PIN: ");
            pin = sc.nextInt();
        } while(pin != 1234);

        System.out.println("Correct PIN!");

    }
}
