package Loops;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*
        print a multiplication table for numbers 1 to 5
        1 * 1 = 1
        1 * 2 = 2
        ...
        1* 10 = 10
        2 * 1 = 2
         */

        for ( int multi= 1 ; multi<=5 ; multi++  ){
           for( int multi2 = 1; multi2<=10; multi2++){
               System.out.println(multi+" * "+multi2+" = "+multi*multi2);
           }

        }
    }
}

