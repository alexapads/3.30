package ProjectMondays;

import java.util.Scanner;

public class NumberTreePyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer");
        int num = scan.nextInt();
        int strt =1;

        String idk = "";
        for(  ; strt<=num ; strt++ ){
            idk +=strt;
            System.out.println(idk);
        }
    }
}
