package strings;

public class MethodChaining {
    public static void main(String[] args) {

        int number= 4;

        String str = "Sun day";

        char ch1 = str.toUpperCase().concat(" is sunny").substring(str.indexOf(" ")).charAt(0);
        System.out.println(ch1); // " "

        short length = (short)(str.concat("is getting tough").length());
        System.out.println(length);

        /* Task: "           Zero to Hero         "
        -change zero to one
        - make string uppercase
        -remove all spaces
        - get only first 3 letters
        - check the length of final part of string and show it
         */

        String task = "        Zero to Hero       ";
        int result = task.replace("Zero","one").toUpperCase().trim().replace(" ","").substring(0,3).length();
        System.out.println(result);

    }
}
