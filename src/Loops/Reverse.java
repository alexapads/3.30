package Loops;

public class Reverse {
    public static void main(String[] args) {
        //String str = "selenium"
        // reverse the string
        String str = "selenium";

        for (int index= str.length()-1; index>=0; index-- ){
            System.out.print(str.charAt(index));
        }
    }
}
