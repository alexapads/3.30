package Scanner;

import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {

        String myName = "Alexa";
        System.out.println(myName);

        Scanner input = new Scanner(System.in); //new scanner

        System.out.println("Please enter your last name");  //message

        String lastName = input.nextLine(); // this line allows user to enter text

        System.out.println("is this your last name? "+lastName);



    }
}
