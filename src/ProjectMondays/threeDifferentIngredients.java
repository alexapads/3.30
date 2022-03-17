package ProjectMondays;

import java.util.Scanner;

public class threeDifferentIngredients {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter three different ingredients all starting with different letters");

        String ingredients = input.nextLine();

        System.out.println("Please enter a number 1-9");
        int number = input.nextInt();

        char char1 = (char) ((char)number+'0');

      char firstLetter = ingredients.charAt(0);
      ingredients = ingredients.replace(firstLetter,char1);

      int indexSecondWord = ingredients.indexOf(' ')+1;
      char secondLetter = ingredients.charAt(indexSecondWord);
      number+=1;
      char char2 = (char)((char)number+'0');
      ingredients = ingredients.replace(secondLetter,char2);

      int indexThirdWord = ingredients.indexOf(' ',indexSecondWord)+1;
      char thirdLetter = ingredients.charAt(indexThirdWord);
      number +=1;
      char char3 = (char)((char)number+'0');
      ingredients = ingredients.replace(thirdLetter,char3);

        System.out.println(ingredients);







    }
}
