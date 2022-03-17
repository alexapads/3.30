package Homework;

import java.util.Scanner;

public class CatsPeople {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number of cats");
        int numberOfCats = s.nextInt();
        System.out.println("Please enter the number of people");
        int numberOfPeople = s.nextInt();

        if(numberOfCats>numberOfPeople){
            System.out.println("Too many cats! The world is meowed!");
        } else if (numberOfCats<numberOfPeople){
            System.out.println("Not many cats! The world is saved!");
        } else {
            System.out.println("Wow! There is a cat for every person.");
        }


    }
}
