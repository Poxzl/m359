package Unit4.LabPilgsitalatin;

import java.util.Locale;

public class PigLatin {
    public static String toPigLatin(String str){
        int lent = str.length();
        String output = "";
        //goes through the string translating every word
        while(str.indexOf(" ") > 0){
            String word = str.substring(0, str.indexOf(" "));
            output += translateWordToPigLatin(word);
            str = str.substring(str.indexOf(" ") + 1);
        }
        //makes only the first letter capitalized
        output += translateWordToPigLatin(str);
        output = output.toLowerCase();
        String firstLetter = output.substring(0, 1);
        return firstLetter.toUpperCase(Locale.ROOT) + output.substring(1);
    }// turns a word into piglatin
    public static String translateWordToPigLatin(String word){
        boolean strtVow = false;
        String conClust = "";
        String vowClust = "";
        boolean hasClust;
        String letter = word.substring(0, 1);
        if(isVowel(letter)){
            strtVow = true;
        }else{// finds the first vowel
            for (int i = 1; i < word.length(); i++) {
                if(isVowel(word.substring(i, i + 1))){
                    hasClust = true;
                    conClust = word.substring(0, i);
                    vowClust = word.substring(i);
                    i = word.length() + 1;
                }
            }
        }//checks how the english word is labeled and makes it into pig Latin
        if(strtVow){
            return word + "yay ";
        }else{
            return vowClust + conClust + "ay ";
        }
    }//checks if a letter is a vowel
    public static boolean isVowel(String letter){
        if(letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")){
            return true;
        }else return false;
    }
}
