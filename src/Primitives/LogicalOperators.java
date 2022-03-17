package Primitives;

public class LogicalOperators {
    public static void main(String[] args) {

        // you can pass a course if
        // your average score is 70% or more AND your attendance is 90% or more

        int requiredAverageScore = 70;
        int requiredAttendance = 90;

        int studentScore = 75;
        int studentAttendance = 100;

        boolean resultScore = studentScore >= requiredAverageScore;
        boolean resultAttendance = studentAttendance >= requiredAttendance;

        boolean pass = resultAttendance && resultScore;
        System.out.println("Can student pass: "+pass);

        boolean pass1 = studentScore >= requiredAverageScore && studentAttendance >= requiredAttendance;
        System.out.println(pass1);
    }
}
