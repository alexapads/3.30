package ProjectMondays;

import java.util.Scanner;

public class UniqueLetters {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        for( int index = 0 ; index<str.length() ; index++ ){
            for ( int x = 1;  x<str.length();  x++){
                if (str.charAt(index)==str.charAt(x)){
                    str=str.substring(0,x);
                    System.out.println(str);
                }

            }

        }



    }
}
