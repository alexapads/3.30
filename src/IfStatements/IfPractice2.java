package IfStatements;

import java.util.Scanner;

public class IfPractice2 {
    public static void main(String[] args) {
        /* task
         get a number between 1 to 7 from user
         if the number is
         1 --> print out "it is monday
         2 --> it is tuesday
         ...
         7 --> it is sunday
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number 1 - 7");
        int number = sc.nextInt();

        if(number ==1){
            System.out.println("It is monday");
        }
        if(number ==2){
            System.out.println("It is tuesday");
        }
        if(number ==3){
            System.out.println("It is wednesday");
        }
        if(number ==4){
            System.out.println("It is thursday");
        }
        if(number ==5){
            System.out.println("It is friday");
        }
        if(number ==6){
            System.out.println("It is saturday");
        }
        if(number ==7){
            System.out.println("It is sunday");
        }
        if(number>7){
            System.out.println(("There is no matching day for your entry"));
        }

    }
}
