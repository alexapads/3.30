package Scanner;

import java.util.Scanner;

public class ScannerPractice4 {
    public static void main(String[] args) {
        Scanner amazon = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = amazon.nextLine();
        System.out.println("How old are you?");
        int age = amazon.nextInt();
        amazon = new Scanner(System.in);
        System.out.println("Who is your favorite player on the Bulls?");
        String bullsPlayer = amazon.nextLine();

        System.out.println("How much money do you have in your account?");
        double account = amazon.nextDouble();
        boolean canIGo = age >= 18;
        boolean canIPay = account>= 400;
        System.out.println("You are old enough to go to the game: "+canIGo);
        System.out.println("You have enough money to go: "+canIPay);
        System.out.println("Do you feel lucky?");
        amazon = new Scanner(System.in);
        String lucky = amazon.next();
        System.out.println(name+", congratulations you have won a special meet and greet with your favorite player "+bullsPlayer);

    }
}
