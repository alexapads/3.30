package Primitives;

public class Casting {
    public static void main(String[] args) {

        //implicit casting

        short itemNumber = 11;
        int i1 = itemNumber;

        //=====================================

        //explicit casting

        long studentNumber = 245;
        int i2 = (int) studentNumber;
        System.out.println(i2);

        short sh1 = 100;
        byte bt1 = (byte) sh1;
        System.out.println(bt1);

        double tax = 11.5;
        int tax1 = (int)tax;
        System.out.println(tax1);

        int tax2 = (short)tax;
        System.out.println(tax2);

        studentNumber -= 4; // studentNumber = studentNumber - 4
        tax += studentNumber;
        tax1 +=tax;

        double cow = 3.2;
        float cat = 2.5f;
        int both = (int)(cow * cat);

        System.out.println(both);



    }
}
