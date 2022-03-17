package Array;

public class MultidimensionalPractice3 {
    public static void main(String[] args) {
        /*
        Computer brands: Apple $2500, Dell $1900, HP $1800, Lenova $1100, Acer $1600
        TVs: Samsung $2199, LG $1699, Sony $1599
        Speakers: Alexa $79, Google $89, Siri $99, Logitec $69, JBL $59
         */

       String[][] brands = {{"Apple", "Dell", "HP", "Lenova", "Acer"},{"Samsung", "LG", "Sony"},{"Alexa", "Google", "Siri", "Logitech", "JBL"}};

       double[][] prices = {{2500, 1900, 1800, 1100, 1600},{2199, 1699, 1599},{79, 89, 99, 69,59}};

        System.out.println("The price for "+brands[0][0]+" is $"+prices[0][0]);

        for(int i=0; i<brands.length; i++){
            for(int x =0; i<brands[i].length; x++){
                System.out.println("The price for "+brands[i][x]+" is $"+prices[i][x]);
            }
        }

    }
}
