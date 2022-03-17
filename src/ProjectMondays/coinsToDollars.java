package ProjectMondays;

import java.util.Scanner;

public class coinsToDollars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input how many quarters you have");
        int quarters = sc.nextInt();

        System.out.println("Please input how many dimes you have");
        int dimes = sc.nextInt();

        System.out.println("Please input how many nickels you have");
        int nickels = sc.nextInt();

        System.out.println("Please input how many pennies you have");
        int pennies = sc.nextInt();

       double money = pennies*.01 + nickels*.05 + dimes*.10 + quarters*.25;

        System.out.println("you have $"+money);




    }
}
