package strings;

public class StringBasic {
    public static void main(String[] args) {

        String text = "Techtorial";
        System.out.println(text);

        System.out.println(text +11); //techtorial11
        System.out.println(text + 11 + 8); //techtorial118

        System.out.println(2+3 +text); //5techtorial
        System.out.println(text+3*2); // techtorial6 bc PEMDAS

        System.out.println(text + " Academy");

        String word = new String("Academy");
        System.out.println(word); // Academy

        System.out.println(text+word);

        text = text + "****";
        System.out.println(text); //techtorial***
        System.out.println(word); //academy

        String dayNumber = "2"+3;
        dayNumber+= " is tomorrow";
        System.out.println(dayNumber); // 23 is tomorrow
        dayNumber += "4";
        System.out.println(dayNumber); // 23 is tomorrow4

        String something = "";
        System.out.println(something); //nothing (see space before ====)
        System.out.println("==========");

    }
}
