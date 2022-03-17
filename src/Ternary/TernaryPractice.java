package Ternary;

public class TernaryPractice {
    public static void main(String[] args) {

        int number1 = 5;
        int number2 = 6;

        String result = number1 > number2 ? "First number" : "hello";
        System.out.println(result); //hello

        int result2 = number1 != number2 ? 8 +2 : 8*2;
        System.out.println(result2); //10

        char result3 = number2 > number1 ? 't':'&';
        System.out.println(result3);// t

        System.out.println(number1>number2 ? 77 : "99"); //cant store an int and string but we can put it in SOUT

        int result4 = number1 != number2 ? number1++ + ++number2 : number1*number2;
        System.out.println(result4); // 12


     }
}
