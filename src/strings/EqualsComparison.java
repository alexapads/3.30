package strings;

public class EqualsComparison {
    public static void main(String[] args) {

        String name1 = "davie";
        String name2 = "davie";

        String name3 = new String("davie");
        String name4 = new String("davie");

        String name5 = name1;
        String name6 = name3;


        System.out.println(name1 == name2); //true
        System.out.println(name1.equals(name2)); //true
        System.out.println(name1 == name3); //false
        System.out.println(name3 == name4); //false

        System.out.println(name1 == name5); //true
        System.out.println(name3 == name6); //true
        System.out.println(name4 == name6); //false

        name2 = name6;

        System.out.println(name2 == name3); // true




    }
}
