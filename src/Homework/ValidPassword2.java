package Homework;

import java.util.Scanner;

public class ValidPassword2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.next();

        char firstChar = password.charAt(0);
        char lastChar = password.charAt(password.length()-1);
        char upperFirst = password.toUpperCase().charAt(0);
        char upperLast = password.toUpperCase().charAt(password.length()-1); //makes last letter from string upper case

        boolean lastNotLetter = (lastChar<'A'||lastChar>'Z')&&(lastChar<'a'||lastChar>'z'); //checks if the last char is not a letter
        if(password.equals(password.equals(password.toUpperCase())||password.equals(password.toLowerCase()))){ //checks password for both upper and lower case letters
            System.out.println("Your password is not acceptable");
        } else if(firstChar==upperFirst&&lastNotLetter&&(firstChar>='A'&&firstChar<='Z')||(firstChar>='a')&& firstChar<='z'){
            System.out.println("Your password is strong");

        } else if (firstChar!=upperFirst&&lastChar==upperLast){
            System.out.println("Your password should be improved");
        } else {
            System.out.println("Your password is not valid");
        }
    }
}
