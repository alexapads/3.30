package Scanner;

import java.util.Scanner;

public class ScannerPractice5 {
    public static void main(String[] args) {
        Scanner atm = new Scanner(System.in);
        double balance = 75;

        System.out.println("Hello, please enter your check");
        double paycheck_1 = atm.nextDouble();
        balance = balance+paycheck_1;
        System.out.println("Your available balance is $"+balance);

        System.out.println("Hello, please enter your check");
        double paycheck_2 = atm.nextDouble();
        balance = balance+paycheck_2;
        System.out.println("Your available balance is $"+balance);

        System.out.println("Hello, please enter your check");
        double paycheck_3 = atm.nextDouble();
        balance = balance+paycheck_3;
        System.out.println("Your available balance is $"+balance);

        boolean loan = balance >= 550;
        System.out.println("You will be approved for a loan: "+loan);



    }
}
