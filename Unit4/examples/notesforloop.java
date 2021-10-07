package Unit4.examples;

public class notesforloop {
    public static void main(String[] args) {
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i+ " ");
        }
        System.out.print("\n");
        for (int i = 5; i <= 100; i+= 5) {
            System.out.print(i+ " ");
        }
        System.out.print("\n");
        String str = "Now THis is a Bruh Moment";
        for (int i = 0; i < str.length(); i++) {
            String chdsa = str.substring(i, i + 1);
            System.out.print(chdsa + " ");
        }
        System.out.print("\n");
        for (int i = str.length(); i > 0; i--) {
            if(i == str.length()){
                String chdsa = str.substring(i - 2, i - 1);
            }
            String chdsa = str.substring(i-1, i);
            System.out.print(chdsa);
        }
    }
}
