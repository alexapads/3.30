package Loops;

public class ForLoopMultipleTerms {
    public static void main(String[] args) {


        for( int i=0, c=5, k=15 ;  i < c && k > c ;  i++, c++, k-- ){

            System.out.println("i is: "+i);
            System.out.println("c is: "+c);
            System.out.println("k is: "+k);
        }


        char ch = 'm';
        int i = 0;

        for (i = 10 , ch='a' ; ch < 'h' || i>2 ; ch++ , i--) {
            System.out.println("hello java");

        }

        //print out the alphabet in lower case letters

        for( char alph = 'a' ; alph <= 'z'  ;  alph++){

            System.out.print(alph+" ");
        }
    }
}
