package Loops;

import java.util.Scanner;

public class While6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string value");
        String string = scan.nextLine();
        /*
        separate each letter with a comma
         */
        int index = 0;
        while(index<=string.length()-1){
            System.out.print(string.charAt(index)+",");
            index++;
        }
    }
}
