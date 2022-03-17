package Homework;

import java.util.Scanner;

public class Concat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str1 = s.next();
        String str2 = s.next();

        if(str1.length()==str2.length()){
            System.out.println(str1.concat(str2));
        } else if(str1.length()>str2.length()){
            int str1Difference = str1.length()-str2.length();
            String substr1 = str1.substring(0,str1.length()-str1Difference);
            System.out.println(substr1.concat(str2));
        } else {
            int str2Difference = str2.length()-str1.length();
            String substr2 = str2.substring(0,(str2.length()-str2Difference));
            System.out.println(str1.concat(substr2));
        }
    }
}
