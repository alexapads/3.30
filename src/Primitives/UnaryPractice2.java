package Primitives;

public class UnaryPractice2 {
    public static void main(String[] args) {

        int flower = 12;
        // increment ++, decrement --
        //pre-increment, pre-decrement
        //post-increment, post-decrement

        flower++; // flower = flower + 1 (post-increment)
        System.out.println(flower); //13

        flower--; // flower = flower - 1 (post-decrement)
        System.out.println(flower); //12

        System.out.println(flower++); // shows 12, but is actually 13
        System.out.println(flower); // 13

        System.out.println(flower--); //shows 13, actually 12
        System.out.println(2*flower); // 24
        //===================================================================
        // flower = 12    pre-increment, pre-decrement

        ++flower;
        System.out.println(flower); //13

        --flower;
        System.out.println(flower); //12

        System.out.println(++flower); //13
        System.out.println(++flower); //14
        System.out.println(--flower); //13
        System.out.println(flower); //13
        //==================================================================

        int k = flower++;
        System.out.println("k is "+k); // 13
        System.out.println(flower); //14

        int m = k + ++k; //13 + 14
        System.out.println("m is "+m); //27

        int a = k; // 14
        int b = m; //27
        int j = a + b++; // 14 + 27 = 41
        System.out.println(j);
        System.out.println(b);

        //===================================================================

        char letter = 'd';
        System.out.println(letter); // d

        letter++;
        System.out.println(letter); //e

        --letter; //d
        --letter; //b
        letter--;
        System.out.println(letter);
        System.out.println(letter--);
        System.out.println(letter);
    }
}
