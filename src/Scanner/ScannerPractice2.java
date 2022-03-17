package Scanner;

import java.util.Scanner;

public class ScannerPractice2 {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firstName = enter.nextLine();

        System.out.println("Enter your last name");
        String lastName = enter.nextLine();

        System.out.println("Hi there, "+ firstName+" "+lastName);
    }
}
