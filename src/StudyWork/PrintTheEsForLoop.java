package StudyWork;

public class PrintTheEsForLoop {
    public static void main(String[] args) {

        String str= "Mercury the meanest kitten";
        String bucket = "";

        for( int index = 0 ; index<str.length() ; index++ ){
            if( str.charAt(index)=='e'){
                bucket+= str.charAt(index);

            }


        }
        System.out.println(bucket.length());

    }
}
