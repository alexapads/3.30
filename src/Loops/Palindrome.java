package Loops;

public class Palindrome {
    public static void main(String[] args) {
        /*
        ana --> palindrome string
        1234321 --> palindrome number
        check if string is palindrome
         */

        String str = "anna";
        String revs = "";

        for (int index= str.length()-1; index>=0; index-- ){
            revs=revs+str.charAt(index);
        }
        if (str.equals(revs)){
            System.out.println(str+" is a palindrome string");
        } else{
            System.out.println("is not");
        }
    }
}
