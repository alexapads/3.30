package Primitives;

public class Farm {
    public static void main(String[]  args){

        /* calculate number of legs in the farm if:
        there are 23 cows and 13 chickens at the farm
         */
        int cows = 23;
        int chickens = 13;

        int cowLegs = 4;
        int chickenLegs = 2;

        int totalLegs = (cowLegs*cows + chickenLegs*chickens);
        System.out.println(totalLegs);
        System.out.println("========================");

        /* calculate cost of animals in farm if:
        each cow costs $1200 and each chicken costs $15
         */

        double cowCost = 1200;
        double chickenCost = 15.99;
        double totalCost = (cowCost*cows + chickenCost*chickens);
        System.out.println(totalCost);


    }
}
