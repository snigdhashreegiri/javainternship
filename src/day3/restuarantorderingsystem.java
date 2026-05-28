package day3;
import java.util.Scanner;
public class restuarantorderingsystem {
	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        int price = 0;

	        System.out.println("1. Veg");
	        System.out.println("2. Non-Veg");

	        System.out.print("Enter choice: ");
	        int choice = sc.nextInt();

	        switch (choice) {

	            case 1:

	                System.out.println("1. Fried Rice");
	                System.out.println("2. Noodles");

	                int veg = sc.nextInt();

	                if (veg == 1) {
	                    price = 150;
	                }

	                else if (veg == 2) {
	                    price = 120;
	                }

	                else {
	                    System.out.println("Invalid Selection");
	                }

	                break;

	            case 2:

	                System.out.println("1. Chicken Biryani");
	                System.out.println("2. Grill Chicken");

	                int nonveg = sc.nextInt();

	                if (nonveg == 1) {
	                    price = 250;
	                }

	                else if (nonveg == 2) {
	                    price = 300;
	                }

	                else {
	                    System.out.println("Invalid Selection");
	                }

	                break;

	            default:
	                System.out.println("Invalid Selection");
	        }

	        System.out.print("Enter quantity: ");
	        int qty = sc.nextInt();

	        System.out.print("Enter member type: ");
	        String member = sc.next();

	        double bill = price * qty;

	        if (member.equals("Gold")) {
	            bill = bill - (bill * 20 / 100);
	        }

	        else if (member.equals("Silver")) {
	            bill = bill - (bill * 10 / 100);
	        }

	        System.out.println("Total Bill = " + bill);

	        if (bill > 2000 && member.equals("Gold")) {
	            System.out.println("Free Dessert");
	        }
	    }
	}
