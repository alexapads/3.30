package ProjectMondays;

import java.util.Scanner;

public class SumOfMinMax {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a minimum amount");
        int min = scan.nextInt();
        System.out.println("Please enter a maximum amount");
        int max = scan.nextInt();


        int sum = 0;
        for(  ; min<=max ; min++ ){
            if(min%2==0 && min%7==0){
                sum = min+sum;
            }
        }
        System.out.println(sum);

    }
}
