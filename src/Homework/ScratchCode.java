package Homework;

public class ScratchCode {
    public static void main(String[] args) {
        String password = "LAVENDER";

        boolean isThereUpperCase = password.equals(password.toLowerCase());
        System.out.println(isThereUpperCase);

        boolean isThereLowerCase = password.equals(password.toUpperCase());
        System.out.println(isThereLowerCase);
    }
}
