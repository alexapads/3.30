package Primitives;

public class CompoundAssignment {
    public static void main(String[] args) {

        int carNumber = 12;
        ///add 5 more cars to initial carNumber

        carNumber = carNumber + 5;
        System.out.println(carNumber);

        carNumber+= 5;
        System.out.println(carNumber);

        carNumber/=2;
        System.out.println(carNumber);

        double fee = carNumber * 100; // carNumber *= 100;
        // fees go up by $51
        fee += carNumber*51; // fee = fee + (carNumber * 51)
        System.out.println(fee);

        ///====================================================

        int number = 21;
        number %= 5;
        System.out.println(number);

        fee %= 4;
        System.out.println(fee);

    }
}
