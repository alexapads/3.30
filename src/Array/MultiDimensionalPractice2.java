package Array;

import java.util.Arrays;

public class MultiDimensionalPractice2 {
    public static void main(String[] args) {

        String[][] citiesOfStates = {{"Chicago","Evanston","Peoria","Wilmette"},{"Miami","Tampa"},{"Houston","Dallas","Austin"}};

        //show all the cities one by one using a regular for loop

        for( int x =0; x<citiesOfStates.length; x++){
            for (  int i = 0; i<citiesOfStates[x].length; i++){
                System.out.println(citiesOfStates[x][i]);
            }
        }


            // nested for each loop
        for( String[] cities : citiesOfStates){
           for(  String city : cities){
               System.out.println(city);
           }
        }

        String[][][] letters ={ {  {"a","b"},{"t"},{"x","y","z"},{"r"}   }, { }  , { }  };

        System.out.println(letters[0][0][0]); //a
        System.out.println(Arrays.deepToString(letters));

        letters[1][0]=new String[]{"Text"};
    }
}
