package Loops;

import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Please enter a number");
        //int number = sc.nextInt();


        // print the divisors of a given number
        // ex: 15 --> 1, 3, 5, etc
        int number = 15;
        int divisor = 1;  //create the first divisible integer variable
        while (divisor<=number){ //while 1 is less than 15
        if(number%divisor==0){ //and if the modulus of 15 / 1 gives no remainder
            System.out.println(divisor+" is a divisor of "+number); // 1 is a divider of 15
        }
        divisor++; //increase the dividing number
        }
    }
}
