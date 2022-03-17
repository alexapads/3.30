package Primitives;

public class Remainder3 {
    public static void main(String[] args) {

        /* phone $986
        monthly payments of $100
        find the last months payment
         */

        int phone = 986, month = 100;
        int lastMonth = phone%month;
        System.out.println(lastMonth);
    }
}
