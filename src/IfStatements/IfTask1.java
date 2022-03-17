package IfStatements;

import java.util.Scanner;

public class IfTask1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 0-12");
        int num = sc.nextInt();


        System.out.println("Please enter 'am' or 'pm'");
        String amPm = sc.next();

        if (amPm.equalsIgnoreCase("am")){
            System.out.println("good morning it is "+num+"am");
        }

        if(amPm.equalsIgnoreCase("pm")){
            System.out.println("good afternoon it is "+num+"pm");
        }


    }
}
