package Array;

import java.util.Arrays;

public class ForEachTask1 {
    public static void main(String[] args) {

        /*
        String[] studentNames= {"Alexa", "Davie", "Alanah", "Phoebe"};
        give them all emails & store into email array
         */

        String[] studentNames= {"Alexa", "Davie", "Alanah", "Phoebe"};

        String[] studentEmails = new String[studentNames.length];
        int index = 0;

        for ( String name: studentNames){
            name.toLowerCase().concat("@gmail.com"); //making names lowercase and adding @gmail to them

            studentEmails[index] =  name.toLowerCase().concat("@gmail.com"); //stores new emails

            index++;
        }
        System.out.println(Arrays.toString(studentEmails));
    }
}
