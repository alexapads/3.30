package Homework;

public class bodyMassIndex {

    public static void main(String[] args){

        System.out.println("Example 1");
        double meter = 1.42;
        double kg = 47.63;
        double bmiMeter = meter * meter;
        double bmi = (kg/bmiMeter);
        System.out.println(bmi);

        System.out.println("Example 2");
        double meter1 = 1.83;
        double kg1 = 55.13;
        double bmiMeter1 = meter1 * meter1;
        double bmi1 = (kg1/bmiMeter1);
        System.out.println(bmi1);

    }
}
