package day4;
import java.util.Scanner;

public class sumuntilnegativenumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num;
        int sum = 0;

        do {
            System.out.print("Enter a number: ");
            num = sc.nextInt();

            if(num >= 0) {
                sum = sum + num;
            }

        } while(num >= 0);

        System.out.println("Final Sum = " + sum);

    }
}


