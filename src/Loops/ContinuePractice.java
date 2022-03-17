package Loops;

public class ContinuePractice {
    public static void main(String[] args) {

        for(int i = 0; i<10; i++){
            if(i>3 && i <6){ //will skip cycle 4 and 5
                // skips when i is equal to 4 and when i is equal to 5
                continue; //continue function will skip the closest iterations
            }
            System.out.println("Saturday"); //will print 8 times
        }
    }
}
