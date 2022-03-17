package strings;

import java.util.Scanner;

public class TaskFeb26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter string value");
        String name = input.nextLine();

        char firstLetter = name.charAt(0);
        System.out.println("First char is: "+firstLetter);

        int count = name.length();

        char lastLetter = name.charAt(name.length()-1);
        System.out.println("Last char is: "+lastLetter);

        int indexC = name.indexOf('c');
        System.out.println("index of letter 'C' is: "+indexC);

        int indexX = name.indexOf('x');
        System.out.println("index of letter 'x' is: "+indexX);

        System.out.println(name.charAt(name.length()/2));





    }
}
