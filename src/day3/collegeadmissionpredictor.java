package day3;
import java.util.Scanner;
public class collegeadmissionpredictor {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Maths marks: ");
	        int m = sc.nextInt();

	        System.out.print("Enter Physics marks: ");
	        int p = sc.nextInt();

	        System.out.print("Enter Chemistry marks: ");
	        int c = sc.nextInt();

	        double avg = (m + p + c) / 3.0;

	        if (m < 35 || p < 35 || c < 35) {
	            System.out.println("Admission Rejected");
	        }

	        else if ((m >= 70 && p >= 60 && c >= 60) || avg >= 80) {

	            System.out.println("Eligible for Admission");

	            if (m > 90 && p > 90 && c > 90) {
	                System.out.println("Eligible for Scholarship");
	            }
	        }

	        else {
	            System.out.println("Not Eligible");
	        }
	    }
	}

