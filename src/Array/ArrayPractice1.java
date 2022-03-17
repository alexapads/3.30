package Array;

import java.util.Arrays;

public class ArrayPractice1 {
    public static void main(String[] args) {

        // 4, 12, 5, 6, 17


        int[] numbers = new int[5];

        numbers[0]=4;
        numbers[3]=12;

        System.out.println(numbers); // hash code (location in memory)
        System.out.println(numbers[0]); // 4
        System.out.println(numbers[3]); // 12

        System.out.println(numbers[1]); // 0 because it is empty


        System.out.println(numbers.length);  //counts the length of the array ->5
        System.out.println("=====================");
        for( int i=0 ; i<numbers.length ; i++ ){
            System.out.print(numbers[i]+" ");  //will print 4 0 0 12 0
        }

        System.out.println(Arrays.toString(numbers)); // [4, 0, 0, 12, 0]
        String a = Arrays.toString(numbers); //stores the array as a string

        numbers[5]=23;




    }
}
