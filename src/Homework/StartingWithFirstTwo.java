package Homework;

import java.util.Scanner;

public class StartingWithFirstTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first string value");
        String firstString = scanner.next();
        System.out.println("Enter second string value");
        String secondString = scanner.next();

        firstString = firstString.substring(firstString.length()-2);
        secondString = secondString.substring(0,2);
        System.out.println(firstString.equalsIgnoreCase(secondString));






    }
}
