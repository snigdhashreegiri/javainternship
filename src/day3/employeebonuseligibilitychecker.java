package day3;
import java.util.Scanner;
public class employeebonuseligibilitychecker {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter years of experience: ");
	        int years = sc.nextInt();

	        System.out.print("Enter attendance percentage: ");
	        int attendance = sc.nextInt();

	        System.out.print("Enter performance rating: ");
	        int rating = sc.nextInt();

	        if (attendance < 60) {
	            System.out.println("Not Eligible");
	        } 
	        else if (years > 3 && attendance > 85) {
	            System.out.println("Eligible");

	            if (rating == 5) {
	                System.out.println("Bonus = 50000");
	            } 
	            else if (rating == 4) {
	                System.out.println("Bonus = 30000");
	            } 
	            else if (rating == 3) {
	                System.out.println("Bonus = 10000");
	            } 
	            else {
	                System.out.println("No Bonus");
	            }
	        } 
	        else {
	            System.out.println("Not Eligible");
	        }
	    }
	}
