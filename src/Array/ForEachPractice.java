package Array;

public class ForEachPractice {
    public static void main(String[] args) {

        String[] colors = {"Red", "blue", "black", "white", "Pink", "Violet", "green", "Yellow", "BROWN"};

        for( String colorName : colors){
            System.out.println(colorName);
        }


        double[] paychecks = { 250, 350, 450, 567.99, 10.99};
        //find the sum of the paychecks using a loop

        double balance = 0;
        for(  double paycheckAmount : paychecks){
            balance += paycheckAmount;
        }
        System.out.println(balance);
    }
}
