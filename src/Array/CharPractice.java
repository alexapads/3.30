package Array;

public class CharPractice {
    public static void main(String[] args) {

        /*
        create an array too store these elements
        and print out only the numbers from the array
         */

        char[] random = {'l', 'K', '7', '?', '2', 'a'};

        for (char item : random) {
            if (Character.isDigit(item)) {
                System.out.println(item);
            }
        }   // find the '?'
        for (char item : random) {
            if (!Character.isLetter(item)&&!Character.isDigit(item)) {
                System.out.println(item);
            }
        }

    }
}
