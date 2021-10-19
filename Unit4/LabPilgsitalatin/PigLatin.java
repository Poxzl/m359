package Unit4.LabPilgsitalatin;

public class PigLatin {
    public static String toPigLatin(String str){
        int lent = str.length();
        String output = "";
        while(str.indexOf(" ") != -1){
            System.out.println(str.indexOf(" "));
            String word = str.substring(0, str.indexOf(" "));
            output += translateWordToPigLatin(word);
            str = str.substring(str.indexOf(" ") + 1);
        }
        output += translateWordToPigLatin(str);
        output = output.toLowerCase();
        String firstWord =
        return output;
    }
    public static String translateWordToPigLatin(String word){
        boolean strtVow = false;
        String conClust = "";
        String vowClust = "";
        boolean hasClust;
        String letter = word.substring(0, 1);
        if(isVowel(letter)){
            strtVow = true;
        }else{
            for (int i = 0; i < word.length(); i++) {
                if(isVowel(word.substring(i, i + 1))){
                    hasClust = true;
                    conClust = word.substring(0, i);
                    vowClust = word.substring(i);
                    i = word.length() + 1;
                }
            }
        }
        if(strtVow){
            return word + "yay ";
        }else{
            return vowClust + conClust + "ay ";
        }
    }
    public static boolean isVowel(String letter){
        if(letter.equalsIgnoreCase("a") || letter.equalsIgnoreCase("e") || letter.equalsIgnoreCase("i") || letter.equalsIgnoreCase("o") || letter.equalsIgnoreCase("u")){
            return true;
        }else return false;
    }
}
