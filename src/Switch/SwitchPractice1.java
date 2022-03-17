package Switch;

public class SwitchPractice1 {
    public static void main(String[] args) {
        int number = 9 ;
        switch (number){
            case 1:
                System.out.println("IT department");
                break;

            case 2:
                System.out.println("HR Department");
                break;
            case 3:
                System.out.println("ADMIN");
                break;
            case 4:
                System.out.println("Help");
                break;
            default:
                System.out.println("Invalid entry");
        }
    }
}
