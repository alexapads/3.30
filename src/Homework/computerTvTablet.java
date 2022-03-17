package Homework;

public class computerTvTablet {
    public static void main(String[] args) {
        int computer = 4;
        int tv = 3;
        int tablet = 5;

        int costComputer = 1000;
        int costTv = 800;
        int costTablet = 450;

        int totalCost = (computer*costComputer + tv*costTv + tablet*costTablet);

        System.out.println(totalCost);

    }

}
