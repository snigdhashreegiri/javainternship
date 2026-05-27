package day2;
import java.util.Scanner;

public class travelexpenseestimator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter travel distance in KM:");
        double distance = sc.nextDouble();

        System.out.println("Enter petrol price per KM:");
        double petrolPrice = sc.nextDouble();

        double totalCost = distance * petrolPrice;

        System.out.println("Total Travel Cost: " + totalCost);

    }
}
