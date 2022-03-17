package Primitives;

public class ComparisonOperatorsPractice {
    public static void main(String[] args) {

        // order pizza if your location is less than 10 miles, delivery fee is free
        // if location is 10 0r more miles, the fee is not free

        int myDistance = 20;
        int limit = 10;

        boolean fee = myDistance >= limit;
        System.out.println(fee); //true

    }
}
