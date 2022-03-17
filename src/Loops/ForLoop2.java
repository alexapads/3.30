package Loops;

public class ForLoop2 {
    public static void main(String[] args) {
        /*
        count and print the number of a single letter in a given string
        output --> There are ... letter 't's in your string
         */

        String str = "Today is the best Day";
        int count = 0; //empty bucket
        //  starts from index 0 ; start and end of str  ; checks index continuously
        for (  int index = 0   ;  index < str.length()  ; index++){
            // checking str for 't' and 'T'
            if(str.charAt(index)== 't' || str.charAt(index) == 'T'){
                count++;    //if str charAt 0,1,2 == t/T --> the count increases
            }
        }  // sout needs to be outside of loop {} to print only once
        System.out.println("There are "+count+" letter 't's in the string.");
    }
}
