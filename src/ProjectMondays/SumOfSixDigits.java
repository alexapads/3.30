package ProjectMondays;

import java.util.Scanner;

public class SumOfSixDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 6 digit number");
        int number = input.nextInt();

        int digit6 = number%10;
        number = number/10;

        int digit5 = number%10;
        number = number/10;

        int digit4 = number%10;
        number = number/10;

        int digit3 = number%10;
        number = number/10;

        int digit2 = number%10;
        number = number/10;

        int digit1 = number%10;
        number = number/10;

        int multiplied = digit1*digit2*digit3*digit4*digit5*digit6;
        int addition = digit1+digit2+digit3+digit4+digit5+digit6;
        System.out.println(digit1+""+digit2+""+digit3+""+digit4+""+digit5+""+digit6);
        System.out.println("Multiplication of all digits is: "+multiplied);
        System.out.println("The sum of all the digits is: "+addition);
    }
}
