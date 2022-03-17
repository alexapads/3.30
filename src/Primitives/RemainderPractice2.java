package Primitives;

public class RemainderPractice2 {
    public static void main(String[] args) {

        // 222 find the product of the digits
        int number = 123;

        int digit1 = number%10; //3
        number = number/10; //12

        int digit2 = number%10; //2
        number = number/10; //1

        int digit3 = number%10; //1
        int product = digit1*digit3*digit2;
        System.out.println(product);

    }
}
