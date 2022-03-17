package strings;

public class StringMethods4 {
    public static void main(String[] args) {
        // replace();

        String course = "Java";

        System.out.println(course.replace('v','$'));

        course = course.replace("a","***");
        System.out.println(course);

        course = "Java";

        System.out.println(course.replace("Java","selenium"));

        course = course.replace("t","x");
        System.out.println(course);

        course = course.replace("Java", "");
        System.out.println(course);
        System.out.println("Too many replacements");

        //===================================================================================================
        // trim();

        String school = "     Academy      ";
        System.out.println(school);
        System.out.println(school.trim());
    }
}
