package Homework;

import java.util.Scanner;

public class WithoutZ {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();


        if(str.charAt(0)=='z'&&str.charAt(1)=='z'){
            String cutZ = str.substring(2);
            System.out.println(cutZ);
        }else if(str.charAt(1)=='z'){
            String firstPart = str.substring(0,1);
            String lastPart = str.substring(2);
            System.out.println(firstPart.concat(lastPart));
        } else if(str.charAt(0)=='z'){
            System.out.println(str.substring(1));
        } else{
            System.out.println(str);
        }
    }
}
