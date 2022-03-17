package ProjectMondays;

import java.util.Scanner;

public class MusicBox {
    public static void main(String[] args) {

        String genre1 = "Classical";
        String genre2 = "Pop";
        String genre3 = "Country";
        String song1 = "Bad Guy", song2 = "Talk", song3 = "Please Me", song4 = "7 Rings", song5 = "Without Me";
        String song6 = "Meant To Be", song7= "Heaven", song8 = "Simple", song9 = "One Number Away", song10= "Get Along";
        String song11 = "Four Seasons", song12 = "Fur Alise", song13 = "Finlandia", song14 = "Vocalise", song15= "The Planets";

        Scanner scan = new Scanner(System.in);
        System.out.println("We have three genres of music: Classical, Pop, Country");
        System.out.println("What kind of music do you listen to?");
        String genreChoice = scan.next();

       String firstUpper =genreChoice.substring(0,1).toUpperCase();
       genreChoice = firstUpper.concat(genreChoice.substring(1));

       switch (genreChoice){
           case "Classical" : case "Pop" : case "Country": break;
           default:
               System.out.println(genreChoice+" is not available.");
       }

       if(genreChoice.equals(genre1)){
           System.out.println("For "+genre1+" the songs we have are:"+song11+", "+song12+", "+song13+", "+song14+", "+song15);
           System.out.println("Which song would you like to play?");
           Scanner scan3 = new Scanner(System.in);
           String songChoiceClassical = scan3.nextLine();
           songChoiceClassical=songChoiceClassical.trim();
           if(songChoiceClassical.equalsIgnoreCase(song11)||songChoiceClassical.equalsIgnoreCase(song12)||songChoiceClassical.equalsIgnoreCase(song13)||songChoiceClassical.equalsIgnoreCase(song14)||songChoiceClassical.equalsIgnoreCase(song15)){
               System.out.println("Please enter $2");
               int classicalPrice = scan.nextInt();
               if(classicalPrice==2){
                   System.out.println(songChoiceClassical+" is playing. Enjoy the song!");
               }else if(classicalPrice<2){
                   System.out.println("$"+classicalPrice+" is not enough money");
               } else if(classicalPrice>2){
                   int classicalChange =classicalPrice-2;
                   System.out.println("Your change is $"+classicalChange+". Your song "+songChoiceClassical+" is now playing.");
               }
           }
       }else if(genreChoice.equals(genre2)){
           System.out.println("For "+genre2+" the songs we have are: "+song1+", "+song2+", "+song3+", "+song4+", "+song5);
               System.out.println("Which song would you like to play?");
               Scanner scan1 = new Scanner(System.in);
               String songChoicePop = scan1.nextLine();
               songChoicePop=songChoicePop.trim();
           if(songChoicePop.equalsIgnoreCase(song1)||songChoicePop.equalsIgnoreCase(song2)||songChoicePop.equalsIgnoreCase(song3)||songChoicePop.equalsIgnoreCase(song4)||songChoicePop.equalsIgnoreCase(song5)) {
               System.out.println("Please enter $4");
               int popPrice = scan.nextInt();
               if(popPrice==4){
                   System.out.println(songChoicePop+" is playing. Enjoy the song!");
               }else if(popPrice<4){
                   System.out.println("$"+popPrice+" is not enough money");
               } else if(popPrice>4){
                   int popChange =popPrice-4;
                   System.out.println("Your change is $"+popChange+". Your song "+songChoicePop+" is now playing.");
               }
           }
       }else if(genreChoice.equals(genre3)){
           System.out.println("For "+genre3+" the songs we have are:"+song6+", "+song7+", "+song8+", "+song9+", "+song10);
               System.out.println("Which song would you like to play?");
               Scanner scan2 = new Scanner(System.in);
               String songChoiceCountry = scan2.nextLine();
               songChoiceCountry=songChoiceCountry.trim();
               if(songChoiceCountry.equalsIgnoreCase(song6)||songChoiceCountry.equalsIgnoreCase(song7)||songChoiceCountry.equalsIgnoreCase(song8)||songChoiceCountry.equalsIgnoreCase(song9)||songChoiceCountry.equalsIgnoreCase(song10)) {
                   System.out.println("Please enter $3");
                   int countryPrice= scan.nextInt();
                   if(countryPrice==3){
                       System.out.println(songChoiceCountry+" is playing. Enjoy the song!");
                   }else if(countryPrice<3){
                       System.out.println("$"+countryPrice+" is not enough money");
                   } else if(countryPrice>3){
                       int countryChange =countryPrice-3;
                       System.out.println("Your change is $"+countryChange+". Your song "+songChoiceCountry+" is now playing.");
                   }
               } else{
                   System.out.println("Please try again");
               }
       }


    }
}
