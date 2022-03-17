package Array;

import java.util.Arrays;

public class ArrayTask2 {
    public static void main(String[] args) {

        int[] ids = {22,33,44,55,1,6,8,100,355};

        // print out the id numbers that are less than 30

        // int x acts as our index reference point
        for( int x= ids.length-1 ; x>= 0 ; x-- ){
            if(ids[x]<30){   // if index of ids is < 30
                System.out.println(ids[x]);  // print that matching index out
            }
        }

        // Object array can hold different kinds of data types

        Object [] items = {"text", 22, 23, '7', 'A', true, false, ids};

        System.out.println(Arrays.toString(items)); 
        

    }
}
