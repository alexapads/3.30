package Array;

import java.util.Arrays;

public class ArrayPractice3 {
    public static void main(String[] args) {

        int[] studentNumbers = {3, 4, 6, 8, 2, 11, 12, 0, 9};

        System.out.println(studentNumbers[0]); // 3
        System.out.println(studentNumbers.length); // 9

       // studentNumbers[9] = 100; // will not work bc index out of bounds

        System.out.println(Arrays.toString(studentNumbers));

        studentNumbers[5] = 500; //reassigns index 5 as 500


        // print the values under array studentNumbers in a for loop
        for ( int k= studentNumbers.length -1; k>=0 ; k-- ){
            
            System.out.println(studentNumbers[k]);
        }



    }
}
