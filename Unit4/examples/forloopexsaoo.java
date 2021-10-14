package Unit4.examples;

public class forloopexsaoo {
    public static void outputBreak(String title){
        System.out.println(title);
    }
    public static void everyOtherLetterPyramid(String str){
        String origstr = str;
        System.out.println(origstr);
        while(origstr.length() > 1){
            String printStr = "";
            for (int i = 0; i < origstr.length(); i++) {
                //System.out.println();
            }
        }
    }






    public static void main(String[] args) {
        for (int i = 5; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.println(i);
            }
        }

        for (int i = 5; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
        everyOtherLetterPyramid("Fremd Vikings");
    }
}
