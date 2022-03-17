package IfStatements;

public class IfPractice1 {
    public static void main(String[] args) {

        System.out.println("I am learning if statements today");

        int num1 = 5;
        int num2 = 5;

        if (num1 == num2) {

            System.out.println("I am happy");
        }
        System.out.println("This is after the if block");

        //apple number to oranges, iff they are the same amount, we will find total payment
        int apple = 20;
        int orange = 20;
        double apple$ = .5, orange$ = .2;

        if(apple==orange){
            double price = apple*apple$ + orange*orange$;
            System.out.println("The total payment is $"+price);
        }



    }
}
