package Homework;

import java.util.Scanner;

public class FindingDad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

       if(str.contains("d")){
           System.out.println("dad");
       }
    }
}
