package Homework;

public class BreakInToDigits {
    public static void main(String[] args) {

        int number= 54321;

        int digit1 = number%10;
        number = number/10;
        System.out.println(digit1);

        int digit2 = number%10;
        number = number/10;
        System.out.println(digit2);

        int digit3 = number%10;
        number = number/10;
        System.out.println(digit3);

        int digit4 = number%10;
        number = number/10;
        System.out.println(digit4);

        int digit5 = number%10;
        System.out.println(digit5);

    }
}
