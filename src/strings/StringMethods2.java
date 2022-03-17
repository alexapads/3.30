package strings;

public class StringMethods2 {
    public static void main(String[] args) {

        String quote = "Do whatever it takes";

        // toUpperCase();   toLowerCase();

        quote = quote.toLowerCase();
        System.out.println(quote); //makes everything lower case

        quote = quote.toUpperCase();
        System.out.println(quote); //makes everything upper case

        quote = quote.concat(" for your SucceSS");
        quote = quote.toLowerCase();
        System.out.println(quote);

        System.out.println(quote.toUpperCase()); // DO WHATEVER IT TAKES FOR SUCCESS
        quote = quote.toUpperCase();

        //================================================================================
        // startsWith()    endsWith();

        boolean starts =quote.startsWith("do"); //false bc DO WHATEVER .. case sensitive
        System.out.println(starts);

        boolean end = quote.endsWith("CESS"); // true
        System.out.println(end);

        System.out.println(quote.endsWith("cess")); //false

        //==================================================================================

        // contains();

        boolean contain = quote.contains("4");
        System.out.println(contain); //false

        System.out.println(quote.contains("DO WHATEVER")); //true

        //================================================================================
        // equals();   equalsIgnoreCase();





    }
}
