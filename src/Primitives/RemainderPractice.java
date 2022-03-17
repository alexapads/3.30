package Primitives;

public class RemainderPractice {
    public static void main(String[] args) {

        // 456 --> 4 + 5 + 6 --> sout(sumofdigits is 15)

        int number = 456;

        int digit1 = number%10;
        number= number/10;

        int digit2 = number%10;
        number=number/10;

        int digit3 = number%10;

        int sumOfDigits = digit1+digit2+digit3;
        System.out.println(sumOfDigits);
    }
}
