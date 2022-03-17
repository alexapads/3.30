package Homework;

import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter a random word");
        String randomWord = user.nextLine();
        System.out.println("enter a number of letter that word consists of");
        int numberOfLetters = user.nextInt();
        System.out.println("Enter a letter that you want to learn its index");
        String enteredLetter = user.next();

        if (numberOfLetters==randomWord.length()){
            System.out.println("true");
        } else if(numberOfLetters!=randomWord.length()){
            System.out.println("false");
        }
        System.out.println(randomWord.indexOf(enteredLetter));
    }
}
