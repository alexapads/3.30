package Primitives;

public class NumericPromotion {
    public static void main(String[] args) {

        byte b1 = 3;
        byte b2 = 6;
        int r1 = b1 + b2; // arithmetic operations have to be stored in primitive type int and over

        float f1 = 2.5f;
        float f2 = 3.1f;
        float r2 = f1 + f2;
        float r3 = 4.5f + 5;
        // float r3= 4.5 + 5; --> compile time error bc it needs 'f'

        double d1 = 6;

        System.out.println(r3 + d1);
        double r5 = r3 + d1;

        short sh1 = 45;
        int r6 = sh1 + b2;


    }
}
