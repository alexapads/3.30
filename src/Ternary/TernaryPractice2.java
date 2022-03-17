package Ternary;

import com.sun.corba.se.impl.encoding.CDROutputObject;

public class TernaryPractice2 {
    public static void main(String[] args) {

        String school = "Techtorial";

        System.out.println(school.contains("oo") ? school.concat("Academy").equalsIgnoreCase("TectorialAcademy")

                : school.toUpperCase()); //TECHTORIAL

        System.out.println('B'=='B' ? "tech".equals("tech") : 111); //true

        short result = 2.3 > 1 ? (short)(8 + 2.5f) : 328*2;
    }
}
