package ProjectMondays;

import java.util.Scanner;

public class IndexSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("please enter three words");
        String words = input.nextLine();

        int firstIndex = words.indexOf(' ');
        char firstChar = words.charAt(firstIndex-1);
        int index_1 = words.indexOf(firstChar);

        int secondIndex = words.indexOf(' ',firstIndex+1);
        char secondChar = words.charAt(secondIndex-1);
        int index_2 = words.indexOf(secondChar);
        char thirdChar = words.charAt(words.length()-1);

        int index_3 = words.indexOf(words.charAt(words.length()-1));

        System.out.println(firstChar);
        System.out.println(secondChar);
        System.out.println(thirdChar);
        System.out.println(index_1);
        System.out.println(index_2);
        System.out.println(index_3);
        System.out.println(index_1+index_2+index_3);
    }
}
