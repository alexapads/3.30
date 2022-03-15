package Homework;

import java.util.Scanner;

public class AlanahNTyler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please print your first name");
        String name = input.nextLine();

        //Scanner input1 = new Scanner(System.in);
        System.out.println("Please enter your age ");
        int name1 = input.nextInt();
       if (name1>= 21){


           System.out.println("you are old enough to booze");

       }

      if (name1<=21){

          System.out.println("you cannot booze ");
      }
    }
}
