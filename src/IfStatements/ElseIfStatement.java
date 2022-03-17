package IfStatements;

import java.util.Scanner;

public class ElseIfStatement {
    public static void main(String[] args) {
        /*
        let user pick a number between 0-20
        if number is between 0 and 5 print "ur range is 0-5"
        if number is between 6 and 10 print "ur range is 6-10"
        if number is between 11 and 15 print "ur range is 11-15"
        if number is between 16 and 20 print "ur range is 16-20"
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number between 0-20");
        int num = sc.nextInt();

        if (num>=0 && num<=5){
            System.out.println("Your range is 0 to 5");
        }else  if (num>=6 && num<=10){
            System.out.println("Your range is 6 to 10");
        } else  if (num>=11 && num<=15){
            System.out.println("Your range is 11 to 15");
        } else  if (num>=16 && num<=20){
            System.out.println("Your range is 16 to 20");
        } else {
            System.out.println("You are out of range");
        }
    }
}
