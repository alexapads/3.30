package Array;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {

        String str = "Java is easy";

        String[] words = str.split(" "); //splitting string at the spaces and storing in new array

        System.out.println(words[0]); //Java

        String date = "01.25.2022";
        String[] result = date.split("\\."); // needs the dashes to separate periods
        System.out.println(Arrays.toString(result));

        //task: Verify if the day from given string is 14 of march
        // String date5 = "3.14.2023";

        String date5 = "3.14.2023";
        String[] task = date5.split("\\.");

        if (task[0].equals("3")){  //has to use .equals because they are objects
            if(task[1].equals("14")){
                System.out.println("it is the correct day");
            }
        } else{
            System.out.println("days do not match");
        }

    }
}
