package strings;

public class StringMethods1 {
    public static void main(String[] args) {

        //concat() method --> combining strings together
        // string is immutable (it does not change the original value unless its reassigned)

        String name = "Jennifer";
        name += " Lopez";
        System.out.println(name);

        name.concat(" is not here"); // this is not the same as reassignment, only shows once
        System.out.println(name); // shows nothing, have to store in sout
        System.out.println(name.concat(" is not here"));

        name = name.concat("!!!"); //reassign with added '!!!'
        System.out.println(name); // Jennifer Lopez!!!

        //=======================================================================
        // length() --> will count and return number(count) of characters in string

        int count = name.length();
        System.out.println("There are "+count+" characters in the string name");

        String animal = "monkeys";
        System.out.println(animal.length()); //6

        //==============================================================================
        // charAt() --> will return a single character from given string given a specific index

        char letter = animal.charAt(1); //o
        System.out.println(letter);

        String text = "these numbers what others got? Your balance is $200.0\n" +
                "How much do you want to deposit for your first check?\n" +
                "480";
        System.out.println(text.charAt(text.length()-1)); //can store methods within each other

        //====================================================================================
        // indexOf() --> will return the index of a given char

        int indexOfO = animal.indexOf('o');
        System.out.println(indexOfO);

        int indexOfX = animal.indexOf('x');
        System.out.println(indexOfX); // -1 because there is no 'x' in the string

        System.out.println(animal.indexOf("nk")); //2
        System.out.println(animal.indexOf("ooo")); //-1

        animal = "bamboo";

        System.out.println(animal.indexOf('b')); // 0

        int indexOfSecond_b = animal.indexOf('b',1);
        System.out.println(indexOfSecond_b); //3




    }
}
