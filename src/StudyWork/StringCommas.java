package StudyWork;

public class StringCommas {
    public static void main(String[] args) {

        String str= "Mercury the meanie";

        int index = 0;
        while (index<= str.length()-1){
            System.out.print(str.charAt(index)+ ",");
            index++;
        }
    }
}
