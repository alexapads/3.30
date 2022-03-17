package Primitives;

public class UnaryPractice {
    public static void main(String[] args) {

        int studentNumber = 25;
        System.out.println(studentNumber); //25

        studentNumber++;
        System.out.println(studentNumber); //26
        System.out.println(studentNumber++); // shows 26 but studentNumber = 27
        System.out.println(studentNumber); //27

        ++studentNumber;
        System.out.println(studentNumber); //28
        System.out.println(++studentNumber); //29
        System.out.println(studentNumber); //29

        //=============================================================================
        int a = 5;
        int i = a++;
        int k = --i+ ++a;
        System.out.println("value of a is "+a); //5
        System.out.println("value of i is "+i); //5
        System.out.println("value of k is "+k); //11

        System.out.println(k);
        System.out.println(--k);
        System.out.println(k--);



    }
}
