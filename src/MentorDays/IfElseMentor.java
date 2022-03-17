package MentorDays;

import java.util.Scanner;

public class IfElseMentor {
    public static void main(String[] args) {
        String action1 = "Naruto", action2 = "Banana Fish", action3 = "Attack on Titan";
        String shoujo1 = "Maid Sama", shoujo2 = "Kamisama Kiss", shoujo3 = "Yona of the Dawn";
        Scanner scan = new Scanner(System.in);

        System.out.println("What is your anime preference, action or shoujo?");
        String movieGenre = scan.nextLine();

        if(movieGenre.equalsIgnoreCase("action")){
            System.out.println("Your anime options are: "+action1+", "+action2+", "+action3);
            System.out.println("Which one would you like to select?");
            String actionChoice = scan.nextLine().trim().toLowerCase();  //THIS MAKES USER INPUT MATCH YOUR OPTIONS

            if (actionChoice.equalsIgnoreCase(action1)){
                System.out.println("You're into the classics! Your choice "+action1+" is $5");
            }else if (actionChoice.equalsIgnoreCase(action2)){
                System.out.println("We love a boy love moment! "+action2+" is $5");
            }else if(actionChoice.equalsIgnoreCase(action3)){
                System.out.println("GOAT selection, team Eren forever! "+action3+" is $5");
            }
        } else if (movieGenre.equalsIgnoreCase("shoujo")){
            System.out.println("Your anime options are: "+shoujo1+", "+shoujo2+", "+shoujo3);
            System.out.println("Which one would you like to select?");
            String shoujoChoice = scan.nextLine();

            if (shoujoChoice.equalsIgnoreCase(shoujo1)){
                System.out.println("You chose "+shoujo1+", please inset $5");
            }else if (shoujoChoice.equalsIgnoreCase(shoujo2)){
                System.out.println("You chose "+shoujo2+", please inset $5");
            }else if(shoujoChoice.equalsIgnoreCase(shoujo3)){
                System.out.println("You chose "+shoujo3+", please inset $5");
            }else {
                System.out.println("Sorry that is not available");
            }
        }
    }
}
