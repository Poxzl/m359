package Unit4.examples;

public class loopexamole {
    public static void main(String[] args) {

        // PART I
        String mySchool = "Fremd Vikings";

        // print every other character of mySchool on the same line
        for (int i = 0; i < mySchool.length(); i+= 2) {
            String lol = mySchool.substring(i, i + 1);
            System.out.print(lol);
        }


        System.out.println("");
        // print the String mySchool in reverse (all characters on the same line)

        for (int i = mySchool.length() - 1; i >= 0; i--) {
            String lol = mySchool.substring(i, i + 1);
            System.out.print(lol);
        }



         /* PART II
           Given the String animal, print the output such that the first line shows
           the first character, the second line shows the second character, and so on

           Ex:  If animal = "monkey" then the output would be:
               m
               mo
               mon
               monk
               monke
               monkey
        */
        System.out.println("");

        String animal = "MONKE MOMENT";
        for (int i = 0; i < animal.length(); i++) {
            String lol = animal.substring(0, i + 1);
            System.out.println(lol);
        }






        // PART III
        String phrase = "Mary had a little lamb, little lamb, little lamb";
        phrase += "Mary had a little lamb, its fleece was white as snow adn little";

        // Print the amount of times the word "little" appears within phrase?
        boolean isDone = false;
        int count = 0;
        while (!isDone){
            int loc = phrase.indexOf("little");
            if(loc != -1) {
                phrase = phrase.substring(loc + 6);
                count++;
            }else isDone = true;
        }
        System.out.println(count);

        // create a new String, or modify the existing String, that removes
        // the word "little" entirely
        phrase = "Mary had a little lamb, little lamb, little lamb";
        boolean isDoner = false;
        while (!isDoner){
            int loc = phrase.indexOf("little");
            if(loc != -1) {
                phrase = phrase.substring(0, loc) + phrase.substring(loc + 6);
            }else isDoner = true;
        }
        System.out.println(phrase);




        // create a new String (based on phrase), or modify the existing String,
        // that replaces the word "little" with the word "BIG"

        phrase = "Mary had a little lamb, little lamb, little lamb";
        boolean isDonern = false;
        while (!isDonern){
            int loc = phrase.indexOf("little");
            if(loc != -1) {
                phrase = phrase.substring(0, loc) + "Brobdingnagian" + phrase.substring(loc + 6);
            }else isDonern = true;
        }
        System.out.println(phrase);


    }
}
