package Homework;

import java.util.Scanner;

public class ThreeWords {
    public static void main(String[] args) {
        String threeWords = new Scanner(System.in).nextLine();

        int firstSpace = threeWords.indexOf(' ');
        String firstWord = threeWords.substring(0,firstSpace);
        int secondSpace = threeWords.indexOf(' ',firstSpace+1);
        String secondWord = threeWords.substring(firstSpace+1,secondSpace);
        String thirdWord = threeWords.substring(secondSpace+1,threeWords.length());

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);

        char word1 = firstWord.charAt(0);
        char word2 = secondWord.charAt(0);
        char word3 = thirdWord.charAt(0);

        System.out.println(word1+""+word2+""+word3);

        char lastLetter1 = firstWord.charAt(firstWord.length()-1);
        char lastLetter2 = secondWord.charAt(secondWord.length()-1);
        char lastLetter3 = thirdWord.charAt(thirdWord.length()-1);

        System.out.println(lastLetter1+""+lastLetter2+""+lastLetter3);

        if(firstWord.length()==secondWord.length()&&secondWord.length()==thirdWord.length()){
            System.out.println("true");

        } else {
            System.out.println("false");
        }



    }
}
