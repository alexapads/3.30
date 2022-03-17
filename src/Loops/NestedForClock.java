package Loops;

public class NestedForClock {
    public static void main(String[] args) {
        /*
        create a digital clock that shows the time as:
             0:1, 0:2, 0:3... 11:59
         */

        for( int hour = 0 ; hour <=11 ; hour++ ){
            for( int min = 0 ; min <=59 ; min++ ){

                System.out.println(hour+":"+min);
            }
        }
    }
}
