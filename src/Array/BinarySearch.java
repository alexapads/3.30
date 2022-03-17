package Array;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {

        int[] numbers = {4,7,8,12,1,25,380,3};

        Arrays.sort(numbers); //have to sort it out first

        System.out.println(Arrays.binarySearch(numbers, 12)); //will show the index of the key


    }
}
