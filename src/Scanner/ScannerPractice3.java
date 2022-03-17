package Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {

        //next()

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter where you live");
        String location = sc.next(); //when using 'next' function, it will only take single word from user entry
                //enter new york
        System.out.println("you live in " +location); // you live in new

        System.out.println("I'm losing part of your city name, can you please enter again?");

        sc = new Scanner(System.in);
        location = sc.nextLine();
        System.out.println("you live in "+location); // you live in New York

        System.out.println("What is your zipcode?");
        int zipcode = sc.nextInt();
        System.out.println("Your zipcode is "+zipcode);

        // take single character from string

        System.out.println("Please enter your first name");

        char firstLetter = sc.next().charAt(0);

        System.out.println("Your first initial is "+firstLetter);

    }
}
