package Loops;

public class PerfectNumber {
    public static void main(String[] args) {


        //check if a number is perfect or not
        int perfNum = 28;
        int sum = 0;
        for (int divisor = 1; divisor <= perfNum / 2; divisor++) {
            if (perfNum % divisor == 0) {
                sum += divisor;
            }
        }
        if (perfNum == sum) {
            System.out.println(perfNum + " is a perfect number");
        }else{
            System.out.println(perfNum+" is not a perfect number");
        }

    }
}
