package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask1 {
    public static void main(String[] args) {
        /*
        ask user to enter how many colors they like
        -get and store the colors in an array

        store colors that are longer than 3 characters in a longcolor array
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("How many colors do you like?");
        int howMany = scan.nextInt();

        String[] colors = new String[howMany];
        String[] longColors = new String[howMany];
        String[] shortColors = new String[howMany];

       //scan.nextLine();
        for( int index = 0 ; index<howMany ; index++ ){
            System.out.println("Please enter a color");
            String colors1 = scan.nextLine();
            //colors[index]= scan.next();
            if(scan.nextLine().length()>3){
               longColors[index] = colors1;
            }else{
                shortColors[index] = colors1;
            }
        }
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(longColors));
        System.out.println(Arrays.toString(shortColors));
    }
}
