package Homework;

import java.util.Scanner;

public class AbletoVote {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String fullName = s.nextLine();
        String stateCode = s.next();
        String city = s.next();
        String gender =s.next();
        int age = s.nextInt();

        if(fullName.startsWith("A")&&fullName.endsWith("V")){
            if(stateCode.startsWith("I")&&stateCode.endsWith("L")){
                if(city.length()<10){
                    if(gender.equalsIgnoreCase("f")){
                        if (age>18){
                            System.out.println("true");
                        }
                    }
                }
            }
        }
        System.out.println("false");
    }
}
