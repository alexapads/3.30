package StudyWork;

public class WhileLoopDivisors {
    public static void main(String[] args) {

        int integer= 45;
        int bucket = 1;
        while(bucket<=integer){
            if (integer%bucket==0){
                System.out.print(bucket+" ");
            }
            bucket++;
        }

    }
}
