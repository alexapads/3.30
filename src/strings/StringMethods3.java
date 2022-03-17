package strings;

public class StringMethods3 {
    public static void main(String[] args) {
        // equals();   equalsIgnoreCase();  --> returns true or false

        String device = "microphone5";
        char i = 'i';
        int five = 5;
        System.out.println(device.equals("microphone"));
        System.out.println(device.equals("MICROPHONE"));
        System.out.println(device.equals("screen"));
        System.out.println(device.equals(five));

        System.out.println(device.equalsIgnoreCase("MICROPHONE"));
        System.out.println(device.equalsIgnoreCase("micRopHone"));
        System.out.println(device.equalsIgnoreCase("apple"));

        //=======================================================================================================
        // substring();

        String item = "flowers are beautiful";

        System.out.println(item.substring(3));
        System.out.println(item.substring(1,4));

        String part = item.substring(5);
        System.out.println(part);

        // take part of the string from 'w' to 't'
        System.out.println(item.substring(item.indexOf('w'),item.indexOf('t')+1));

        //take part of the string starting from 'w' to 'e'(the e in beautiful)

        System.out.println(item.substring(item.indexOf('w'),item.indexOf('b')+2));

        System.out.println(item.substring(2,2));

        //===========================================================================================
        // replace();
    }
}
