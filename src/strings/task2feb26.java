package strings;

import java.util.Scanner;

public class task2feb26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your gender (M/F), your full name, and your birth year.");

        String info = input.nextLine();

        System.out.println("Starts with f: "+info.startsWith("F"));
        System.out.println("Starts with m: "+info.startsWith("M"));
         String myName = "Alexa";
        System.out.println("Does string contain my name: "+info.contains(myName));
        System.out.println("Doest string end in birth year "+info.endsWith("99"));

        char lastChar = info.charAt(info.length()-1);
        boolean isDigit = lastChar>= '0' && lastChar <= '9';
        System.out.println(isDigit);
    }
}
