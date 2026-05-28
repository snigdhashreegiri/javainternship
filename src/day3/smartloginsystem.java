package day3;
import java.util.Scanner;
public class smartloginsystem {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter username: ");
	        String username = sc.next();

	        System.out.print("Enter password: ");
	        String password = sc.next();

	        if (username.equals("admin") && password.equals("Java@123")) {

	            System.out.print("Enter OTP: ");
	            int otp = sc.nextInt();

	            if (otp >= 1000 && otp <= 9999) {
	                System.out.println("Login Successful");
	            }

	            else {
	                System.out.println("Invalid OTP");
	            }
	        }

	        else {
	            System.out.println("Invalid Username or Password");
	        }
	    }
	}