package Loops;

import java.util.Scanner;

public class DoWhile3 {
    public static void main(String[] args) {
        /*
        ask user for int number and make a star three for that many lines
        ex: 5
        *
        **
        ***
        ****
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an int number");
        int number = scan.nextInt();


        String str = ""; //empty bucket
        do{
            str = str+"*"; // * = *+* and so on
            System.out.println(str);
            number--; // stops the loop
        } while(0<number);
    }
}
