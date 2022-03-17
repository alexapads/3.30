package StudyWork;

public class StringPractice {
    public static void main(String[] args) {
        String firstName = "Alexa";
        System.out.println(firstName);

        String lastName = new String (" Padiernos");
        System.out.println(lastName);

        String fullName = firstName+lastName;
        System.out.println(fullName);

        int nameCount = fullName.length();
        System.out.println("There are "+(nameCount-1)+" characters in your full name.");

        char firstInitial = firstName.charAt(0);
        char lastInitial = lastName.charAt(1);
        System.out.println("your initials are: "+firstInitial+" and "+lastInitial);
    }
}
