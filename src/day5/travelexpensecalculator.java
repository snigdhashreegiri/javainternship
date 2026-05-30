package day5;
import java.util.Scanner;

public abstract class travelexpensecalculator {

    public static double calculateCost(double distance, double mileage, double petrolPrice) {

        double petrolNeeded = distance / mileage;
        double travelCost = petrolNeeded * petrolPrice;

        return travelCost;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Distance: ");
        double distance = sc.nextDouble();

        System.out.print("Enter Mileage: ");
        double mileage = sc.nextDouble();

        System.out.print("Enter Petrol Price Per Litre: ");
        double petrolPrice = sc.nextDouble();

        double cost = calculateCost(distance, mileage, petrolPrice);

        System.out.println("Estimated Travel Cost: " + cost);
    }
}
