package Primitives;

public class ArithmeticOperators {
    public static void main(String[] args){

        int num = 9;
        //addition --> +
        int sum = num + 3; //sum --> 12
        System.out.println(sum);

        int num1 = 34;
        //subtraction --> -
        int result = sum - num1; //--> -22
        System.out.println(result);

        double result1 = sum - num; //--> 3
        System.out.println(result1);

        //multiplication --> *
        double multiply = result1 * sum; //--> 36

        int multiply1 = 5*8; //-->40

        //division --> /
        int num2 = 12;
        int num3 = 4;

        int division = num2 / num3;
        System.out.println(division);

        double division1 = num2 / 2.5;
        System.out.println(division1);

        int division3 = 15/4;
        System.out.println(division3); //-->3

        double division4 = 15/4;
        System.out.println(division4);

        float division5 = 15/4f;
        System.out.println(division5);

        // modulus (remainder) --> %

        int remainder = 15%6;
        System.out.println(remainder);

        int remainder2 = 6 % 4;
        System.out.println(remainder2);

        int x = 12, a = 5, b = x + a, k = b/2;
        System.out.println(k-a); //--> 3

        int people = 10;
        int burgers = 45;
        int leftOverBurgers = 45%10;
        System.out.println(leftOverBurgers+ " burgers are left over after people share them evenly");






    }
}
