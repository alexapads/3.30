package Array;

public class ArrayTask4 {
    public static void main(String[] args) {
        /*
        int[] numbers = {12,19,5,15,18,11,21,9,7,4,13};
        which number pairs can make the sum of 30
         */

        int[] numbers = {12,19,5,15,18,11,21,9,7,4,13};
        for( int i = 0; i<numbers.length; i++){
            for( int k= i+1; k<numbers.length; k++){
                if(numbers[i]+numbers[k]==30){
                    System.out.println(numbers[i]+" + "+numbers[k]+" = 30");
                }
            }
        }
    }
}
