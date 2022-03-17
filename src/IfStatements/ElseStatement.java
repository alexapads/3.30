package IfStatements;

import java.util.Scanner;

public class ElseStatement {
    public static void main(String[] args) {


        // get the answer from user and use if statement

        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a drivers license? true/false");
        boolean license = input.nextBoolean();

        if(license){

            System.out.println("You can drive in illinois");
        } else{
            System.out.println("go to the DMV");
        }

        //or
        System.out.println("Do you have a drivers license? yes/no");
        String yesNo = input.next();

        if (yesNo.equalsIgnoreCase("yes")){
            System.out.println("You can drive in illinois");
        } else{
        System.out.println("go to the DMV");
    }
    }
}
