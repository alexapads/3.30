package Array;

public class BiggestNumber {
    public static void main(String[] args) {

        //find the biggest number from array

        int[] zipcodes = {23, 45, 12, 55, 100, 690, 33, 45};

       int biggest = zipcodes[0]; //comparison bucket
        for( int index = 0 ; index< zipcodes.length ; index++ ){
          if( zipcodes[index]>biggest){ // if zipcode at index is bigger than our bucket

               biggest = zipcodes[index]; //  then we switch
          }

        }
        System.out.println(biggest);
    }
}
