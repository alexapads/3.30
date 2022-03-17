package IfStatements;

import java.util.Scanner;

public class NestedIfTask1 {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Do you know java/C#/Python? ");
        String java = scan.next();
        //can use equalsIgnoreCase
        if(java.equalsIgnoreCase("java")||java.equalsIgnoreCase("c#")||java.equalsIgnoreCase("python")){
            System.out.println("Do you know selenium? true or false");
            boolean selenium = scan.nextBoolean();
            if(selenium){
                System.out.println("Do you know API Testing? true or false");
                boolean api = scan.nextBoolean();
                if(api){
                    System.out.println("Do you know SQL? true or false");
                    boolean sql = scan.nextBoolean();
                    if (sql){
                        System.out.println("you are hired");
                    } else{
                        System.out.println("please learn SQL");
                    }
                } else {
                    System.out.println("we need API knowledge");
                }
            } else {
                System.out.println("we need selenium skills");
            }
        } else{
            System.out.println("please learn java and try again");
        }
    }
}
