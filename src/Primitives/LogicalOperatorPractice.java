package Primitives;

public class LogicalOperatorPractice {
    public static void main(String[] args) {

        // You are taking three exams from math class. to be able to pass:
        // average score must be 60 or more and class average has to be less than your average

        int exam1 = 100;
        int exam2 = 50;
        int exam3 = 85;

        int requiredScore = 60;
        int classAverage = 55;

        boolean result = (exam1+exam2+exam3)/3 >= requiredScore && classAverage < (exam1+exam2+exam3)/3;

        System.out.println("Student will pass: "+result);
    }
}
