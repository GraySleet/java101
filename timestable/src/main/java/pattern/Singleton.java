package pattern;

import java.util.Scanner;

public class Singleton {
    // public instance initialized when loading the class
    private static final Singleton instance = new Singleton();

    //note the static, make it singleton.
    private static Singleton single_instance = null;
    public String thing;

    private Singleton() {
// make it private, so caller does not new it .

    }

    /**
     * The method returnning the singleton instance.
     *
     * @return
     */
    public static Singleton getInstance() {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }

    /**
     * Utility method for striping the white space from the input
     * method should not be static
     *
     * @param input
     * @return the string without space
     */
    public String stripString(final String input) {
        if (input == null || input.length() == 0) {
            return "error";
        }
        String x = "";
        for (int i = 0; i < input.length(); i++) {
            if (!input.substring(i, i+1).equals(" ")){
                x += input.substring(i, i+1);
            }

        }
        return x;

    }
    //strip spaces from a string

    // only difference between a normal class is that it normal uses the constructor, singleton uses the getInstance (or the getmatthew) method
//constructor is private
//returns something
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("This program will remove all the spaces from your string.");
        System.out.println("Enter your string.");
        String myinputString = in.nextLine();
        System.out.println("result:" + Singleton.getInstance().stripString(myinputString));


    }

}