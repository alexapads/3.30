package MentorDays;

public class Practice1 {
    public static void main(String[] args) {

        int totalMinutes = 4324424;

        int yearsAsMinutes = 60*24*365; //525600

        int daysAsMinutes = 24*60; //1440

        int year = totalMinutes/yearsAsMinutes; //8
        int days = (totalMinutes%yearsAsMinutes)/daysAsMinutes;

        System.out.println(totalMinutes+ " minutes is equal to "+year+" years and "+ days+" days.");

    }
}
