package Array;

import java.util.Arrays;

public class ArrayTask3 {
    public static void main(String[] args) {

        /*
        Print out every element in reverse order from given string
        String[] flowers ={"rose", "daisies", "sunflowers", "peonies"};
        esor seisiad
         */



        String[] flowers ={"rose", "daisies", "sunflowers", "peonies"};

        for ( String flowers1 : flowers){
            String reverse="";
            for ( int x= flowers1.length()-1 ; x>=0 ; x-- ){
                reverse+=flowers1.charAt(x);

            }
            System.out.println(reverse);

        }
    }
}
