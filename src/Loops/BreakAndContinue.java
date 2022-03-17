package Loops;

public class BreakAndContinue {
    public static void main(String[] args) {

        LOOPNAME:    // we can name our loops
        for( int i=0 ; i<10 ; i++ ){

            for( int j=0 ; j<5 ; j++ ){

                System.out.println("davicito");

                //break; //10 cycles
                break LOOPNAME; // 1 print out
            }
           // break; // 5 cycles check matching scopes
        }
    }
}
