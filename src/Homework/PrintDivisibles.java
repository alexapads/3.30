package Homework;

import java.util.Scanner;

public class PrintDivisibles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startingNumber = scanner.nextInt();
        int endingNumber = scanner.nextInt();

        int count =0;
       for ( int num=startingNumber ; num < endingNumber; num++ ){
           if(num%3==0 && num%5==0){
               String result = num +" ";

               for ( int index = 0; index<result.length() ; index++ ){
                   if(result.charAt(index)==' '){
                       count++;
                   }
               }
           }
       }
        System.out.println(count);
    }
}
