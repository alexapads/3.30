package Array;

import java.util.Arrays;

public class SortPractice {
    public static void main(String[] args) {

        // sort() --> will sort from smallest to largest or alphabetically, capitalization is important

        int[] zipcodes = {23, 45, 12, 55, 100, 690, 33, 45};

        System.out.println(Arrays.toString(zipcodes));

        Arrays.sort(zipcodes);
        System.out.println(Arrays.toString(zipcodes));

        //2nd largest zipcode

        System.out.println(zipcodes[zipcodes.length-2]);


            //change every item from colors array to lowercase and store it in new colors alphabetically
        String[] colors = {"Red", "blue", "black", "white", "Pink", "Violet", "green", "Yellow", "BROWN"};

        Arrays.sort(colors);

        String[] newColors = new String[colors.length];


        for(int index = 0;  index<colors.length ; index++){

           newColors[index] = colors[index].toLowerCase(); //putting one into the other
        }
        System.out.println(Arrays.toString(newColors));


    }
}
