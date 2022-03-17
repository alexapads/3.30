package Primitives;

public class LogicalNegations {
    public static void main(String[] args) {

        boolean isLightOn = true;
        System.out.println(isLightOn); //true

        System.out.println(!isLightOn); //false

        System.out.println(isLightOn); //true

        isLightOn = false;
        System.out.println(isLightOn); //false

    }
}
