package day2;
import java.util.Scanner;

public class studentresultanalyser {

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name:");
        String name = sc.nextLine();

        System.out.println("Enter marks of subject 1:");
        int sub1 = sc.nextInt();

        System.out.println("Enter marks of subject 2:");
        int sub2 = sc.nextInt();

        System.out.println("Enter marks of subject 3:");
        int sub3 = sc.nextInt();

        int total = sub1 + sub2 + sub3;

        double average = total / 3.0;

        boolean result = average > 50;

        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Average greater than 50: " + result);

	}

}
