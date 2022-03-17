package IfStatements;

import java.util.Scanner;

public class ElseTask1 {
    public static void main(String[] args) {
        /*
        ask user to enter their zipcode
        if zipcode is an even number say: "your zip is even"
        if zipcode is odd: "your zip is odd
         */
        Scanner task = new Scanner(System.in);
        System.out.println("Please enter your zipcode");
        int zipcode = task.nextInt();


        if(zipcode%2 == 0){
            System.out.println("Your zipcode is even");
        }else{
            System.out.println("Your zipcode is odd");
        }
    }
}
