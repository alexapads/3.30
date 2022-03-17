package Loops;

public class While2 {
    public static void main(String[] args) {
        //print today is sunday 10 times

        int a = 1;

        while (a<11){
            System.out.println(a+"Today is Sunday");
            a++;
        }

        int x = 1;
        while ((x<=10)){
            System.out.println("Today is funday");
            x++;
        }
        // print numbers from 10-0
        int d = 10;
        while (d>=0){
            System.out.println(d);
            d--;
        }
        //print numbers 0-20 skipping by 2s
        int v = 0;
        while (v<21) {
            System.out.println(v);
            v+=2;
        }
        int j = 1;
        while(j<23){
            System.out.print(j+" "); // 1, 3, 5, 7
            j++;
            j++;
        }

        //infinite loop
       // int t = 7;
       // while(t==7){
       //     System.out.println("Hello");

       // }
    }
}
