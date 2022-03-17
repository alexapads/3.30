package ProjectMondays;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        str=str.trim();

        String reverse = "";
        for ( int index = str.length()-1 ; index>=0 ; index-- ){
            reverse+=str.charAt(index);
        }
        System.out.print(reverse);
    }
}
