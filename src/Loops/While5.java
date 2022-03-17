package Loops;

import java.util.Scanner;

public class While5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();

        /*
        create a multiplication table from 1 to 10
        ex: 3--> 3 * 1 = 3
                3 * 2 = 6
                .....
                3 * 10 = 30
         */
        int mult = 1;
        while (mult<=10){
            System.out.println(number+"*"+mult+"="+(number*mult));
            mult++;

        }
    }
}
