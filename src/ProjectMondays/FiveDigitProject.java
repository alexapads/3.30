package ProjectMondays;

import java.util.Scanner;

public class FiveDigitProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any five digit number");
        int number = sc.nextInt();

        int digit5 = number%10;
        number = number/10;

        int digit4 = number%10;
        number = number/10;

        int digit3 = number%10;
        number = number/10;

        int digit2 = number%10;
        number = number/10;

        int digit1 = number%10;

        System.out.println(digit5+""+digit4+""+digit3+""+digit2+""+digit1);
    }
}
