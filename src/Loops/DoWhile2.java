package Loops;

import java.util.Scanner;

public class DoWhile2 {
    public static void main(String[] args) {
        /*
        ask user for 2 numbers
        find the sum of numbers in between
        ex-> num1=6 num2= 8, 6 + 7 + 8
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number1= scan.nextInt();
        System.out.println("Enter another number");
        int number2 = scan.nextInt();

        int total = 0;
       do{
           total = total + number1;
           number1++;
       } while(number1<=number2);

        System.out.println(total);
    }
}
