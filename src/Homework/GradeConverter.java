package Homework;

import java.util.Scanner;

public class GradeConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your letter grade");
        String grade = scan.nextLine();

        if (grade.equalsIgnoreCase("A")){
            System.out.println("4.0");
        } else if(grade.equalsIgnoreCase("a-")){
            System.out.println("3.7");
        } else if(grade.equalsIgnoreCase("b+")){
            System.out.println("3.3");
        } else if(grade.equalsIgnoreCase("b")){
            System.out.println("3.0");
        } else if(grade.equalsIgnoreCase("b-")){
            System.out.println("2.7");
        } else if(grade.equalsIgnoreCase("c+")){
            System.out.println("2.3");
        } else if(grade.equalsIgnoreCase("c")){
            System.out.println("2.0");
        } else if(grade.equalsIgnoreCase("c-")){
            System.out.println("1.7");
        } else if(grade.equalsIgnoreCase("d+")){
            System.out.println("1.3");
        } else if(grade.equalsIgnoreCase("d")){
            System.out.println("1.0");
        } else if(grade.equalsIgnoreCase("f")){
            System.out.println("0.0");
    }
}}
