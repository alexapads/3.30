package IfStatements;

import java.util.Scanner;

public class ElseIfTask2 {
    public static void main(String[] args) {
        /*
        ask user to give a whole number
        if the number is greater than 0 print it is positive
        if the number is less than 0 print it is negative
        if the number is 0 print your number is 0
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter any whole number");
        int number = scan.nextInt();

        if (number>0){
            System.out.println("Your number is positive");
        } else if (number<0){
            System.out.println("Your number is negative");
        } else if (number ==0){
            System.out.println("your number is 0");
        }
    }
}
