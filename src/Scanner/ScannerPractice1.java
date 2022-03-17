package Scanner;

import java.util.Scanner;

public class ScannerPractice1 {
    public static void main(String[] args) {

        // you want to take age of user and tell user he/she was .... years old 10 years ago

        Scanner scanner= new Scanner(System.in);

        System.out.println("Please enter your current age");

        int yourAge = scanner.nextInt();

        int ageMinus10 = yourAge-10;

        System.out.println("You were "+ ageMinus10+" years old, 10 years ago.");

        //ask user to provide their height in meters and convert and show it in centimeters

        //we do not need to add another scanner
        System.out.println("Please enter your height in meters");

        double yourHeight = scanner.nextDouble();


        System.out.println("Your height in centimeters is "+yourHeight*100);

        // ask user to provide their weight in kilograms then calculate users BMI

        System.out.println("Please enter your weight in kilograms");

        double yourWeight = scanner.nextDouble();
        double bmi = yourWeight/(yourHeight*yourHeight);

        System.out.println("Your BMI is "+ bmi);


    }
}
