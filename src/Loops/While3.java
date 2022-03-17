package Loops;

public class While3 {
    public static void main(String[] args) {

        /* your age is 21 now
        "MY age is ..." till 30
         */
        int age = 21;
        while(age<=30){
            System.out.println("My age is "+age);
            age++;
        }
        //find sum of numbers between 12 and 18 and show final sum --> 12 + 13 + 14 + 15 + 16
        int num = 12;
        int sum = 0;
        while (num<19){
           sum = sum + num;
           num++;

        }
        System.out.println("Total is: "+sum); //print out of loop for one final answer


    }

}
