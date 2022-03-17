package Array;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {
        //strings

        String[] studentNames = new String[10];

        System.out.println(Arrays.toString(studentNames)); //default values

        studentNames[1]="Davie";
        studentNames[2]="Alexa";
        studentNames[8]="Mikhail";
        studentNames[5]= "Phoebe";
        System.out.println(Arrays.toString(studentNames));

        studentNames[8]="Alanah";
        System.out.println(Arrays.toString(studentNames));


            // print the names individually
        for( int index = studentNames.length-1 ; index>-1 ; index-- ){
            System.out.println(studentNames[index]);
        }
    }
}
