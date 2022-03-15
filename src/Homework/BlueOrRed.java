package Homework;

import java.util.Locale;
import java.util.Scanner;

public class BlueOrRed {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();

        char blue1 = 'b', blue2 = 'l', blue3 = 'u', blue4 = 'e';

        str=str.toLowerCase();

        if(str.contains("r")&&str.contains("e")&&str.contains("d")){
            System.out.println("red");
        } else if(str.contains("b")&&str.contains("l")&&str.contains("u")&&str.contains("e")){
            System.out.println("blue");
        }
    }
}
