package Array;

import java.util.Arrays;

public class MultidimensionalPractice {
    public static void main(String[] args) {

        int[][] numbers = new int[3][5]; // there will be 5 elements in 3 arrays

        System.out.println(Arrays.deepToString(numbers)); //[[0, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]

        numbers[0][0] = 11;
        System.out.println(Arrays.deepToString(numbers)); //[[11, 0, 0, 0, 0], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]

        numbers[0][4]=22;
        System.out.println(Arrays.deepToString(numbers)); //[[11, 0, 0, 0, 22], [0, 0, 0, 0, 0], [0, 0, 0, 0, 0]]

        numbers[2][4]=7;
        System.out.println(Arrays.deepToString(numbers)); //[[11, 0, 0, 0, 22], [0, 0, 0, 0, 0], [0, 0, 0, 0, 7]]

       // numbers[1][5]=77; //will not work bc there is no index 5

        int[] nums = new int[6];
        nums[3] = 8;
        System.out.println(Arrays.toString(nums));

        numbers[0][0]=200;
        System.out.println(numbers[0][0]); //200

        System.out.println(Arrays.toString(numbers[2]));
        System.out.println(numbers[2][4]);
        System.out.println(Arrays.deepToString(numbers));

        //use a for loop to print the multidimensional array
        for( int i= 0 ; i< numbers.length ; i++ ){
            for( int x =0 ; x<numbers[i].length ; x++ ){
                System.out.print(numbers[i][x]);
            }
        }

    }
}
