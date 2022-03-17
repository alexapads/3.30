package Homework;

import java.util.Scanner;

public class LoopMultiplication {
    public static void main(String[] args) {
        int num = new Scanner(System.in).nextInt();

        int bucket = 1;
        while(bucket<=10){
            System.out.println(num+" * "+bucket+" = "+num*bucket);
            bucket++;
        }
    }
}
