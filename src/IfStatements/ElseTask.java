package IfStatements;

import java.util.Scanner;

public class ElseTask {
    public static void main(String[] args) {
        /*
        when your order is $100 or  more, you will get 20%  discount
        if the order is less than $100, you will 5%
        calculate the final payment for each case and print
         */
        Scanner input = new Scanner(System.in);
        System.out.println("How much is your item?");
        double order = input.nextDouble();
        if(order>= 100){
            System.out.println("your order costs: $"+(order-(order*.20)));
        }else{
            System.out.println("your order costs: $"+(order-order*.05));
        }
    }
}
