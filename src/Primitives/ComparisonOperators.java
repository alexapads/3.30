package Primitives;

public class ComparisonOperators {
    public static void main(String[] args) {

        int a = 4, b = 4;

       boolean result1= a == b;
        System.out.println(result1); //true
        System.out.println(!result1); //false

        boolean result2 = a != b;
        System.out.println(result2); //false

        boolean r3 = a>b;
        System.out.println(r3); //false

        boolean r4 = a<b;
        System.out.println(r4); //false

        System.out.println(50 == 50);
        System.out.println('c'>'d'); //false
        System.out.println(67 != 67); //false
        System.out.println('c'>'b'); //true
        System.out.println(true != false); //true
        System.out.println();


    }
}
