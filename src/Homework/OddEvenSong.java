package Homework;

import java.util.Scanner;

public class OddEvenSong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

       int trim = string.replace(" ", "").length();
        System.out.println(trim%2!=0);

    }
    }




