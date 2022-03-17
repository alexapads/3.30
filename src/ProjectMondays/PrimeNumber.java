package ProjectMondays;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer number");
        int num = scan.nextInt();

        for(  int i =2 ; i<num ; i++ ){
            if(num%i==0){
                System.out.println("Is not a prime number");
                break;
            } else{
                System.out.println("Is a prime number");
                break;
            }
        }
    }
}
