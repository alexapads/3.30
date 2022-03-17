package Scanner;

import java.util.Scanner;

public class MoneyTransaction {
    public static void main(String[] args) {

        Scanner deposit = new  Scanner(System.in);
        System.out.println("Please enter first paycheck amount");

        double accountBalance = 200;

        Double firstPaycheck = deposit.nextDouble(); // instead of these 2 lines you can write accountBalance += deposit.nextDouble
        accountBalance = accountBalance+firstPaycheck;
        System.out.println("Your balance is now $"+accountBalance);

        System.out.println("Please enter next paycheck");
        double secondPaycheck = deposit.nextDouble();
        accountBalance = accountBalance + secondPaycheck;
        System.out.println("Your balance is now $"+accountBalance);

        System.out.println("Please enter next paycheck");
        double thirdPaycheck = deposit.nextDouble();
        accountBalance = accountBalance + thirdPaycheck;
        System.out.println("Your balance is now $"+accountBalance);

        double phone = 599, headphone = 299;
        System.out.println("your balance after transactions is $"+ (accountBalance-(phone+headphone)));

;    }
}
