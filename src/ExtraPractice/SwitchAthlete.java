package ExtraPractice;

import java.util.Scanner;

public class SwitchAthlete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your favorite sport?");
        String sport = scan.next();

        sport=sport.toLowerCase().trim();
        switch(sport){
            case "football":
                System.out.println("Tom Brady"); break;
            case "baseball":
                System.out.println("Anthony Rizzo"); break;
            case "basketball":
                System.out.println("Zach Lavine"); break;
            case "soccer":
                System.out.println("Beckham"); break;
            case "golf":
                System.out.println("Tiger Woods"); break;

            default:
                System.out.println("Try a different sport");

        }
    }
}
