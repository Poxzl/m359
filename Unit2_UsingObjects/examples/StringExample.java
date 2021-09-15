package Unit2_UsingObjects.examples;

public class StringExample {
    public static void main(String[] args) {
        String s1 = "Vacation";
        String s2 = "Sunshine cures all things";
        // .toUpperCase turns a string into all caps.
        System.out.println(s1.toUpperCase());
        // this prints out the string
        System.out.println(s1);
        // finds if theres the entered string in the string, and then returns the index, if not found returns -1
        System.out.println(s2.indexOf("u"));
        // finds if theres the entered string in the string, and then returns the index, if not found returns -1
        System.out.println(s2.indexOf("x"));
        //prints the letters of a string starting from the fourth index all the way to the end
        System.out.println(s1.substring(4));
        //prints the letters of a string starting from the second index and ending at the fifth index
        System.out.println(s1.substring(2, 5));
        // prints out the length of a string
        System.out.println(s1.length());
        // prints out the length of a string
        System.out.println(s2.length());
        //.equals(string) finds if a string is the same as the other string, this is false because vacation isnt VACATION
        boolean isEqual = s1.equals("VACATION");
        System.out.println(isEqual);
        //.equals(string) finds if a string is the same as the other string, this is true because "vacation" is "vacation"
        isEqual = s1.equals("Vacation");
        System.out.println(isEqual);
        //.equals(string) finds if a string is the same as the other string, this is true because vacation to uppercase is VACATION
        isEqual = s1.toUpperCase().equals("VACATION");
        System.out.println(isEqual);

        String s3 = "bat";
        String s4 = "bird";
        String s5 = "Mickey";

        System.out.println(s3.compareTo(s4));
        System.out.println(s3.compareTo(s3));
        System.out.println(s4.compareTo(s3));
        System.out.println(s5.compareTo(s3));
        // prints out a string, the plus signs concatenate the letters into one string
        System.out.println("I love " + "M" + "3" + "5" + "9");
        //prints out a string, the parenthesis allow the numbers to add together before being printed
        System.out.println("I love " + "M" + (3 + 5 + 9));
        // adds the two numbers before and then prints the answer followed by the string, it isnt added becuase the equation is before a string is read.
        System.out.println(24 + 56 + " Days of School");

        System.out.println("Days of School: " + 24 + 56);
    }
}
