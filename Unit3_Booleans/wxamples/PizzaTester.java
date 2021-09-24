package Unit3_Booleans.wxamples;

public class PizzaTester {
    public static void main(String[] args) {
        //make a pizza object

        // have it print out its info

        pizza pisa1 = new pizza("Dominoes", 2, 2, true);
        pizza pisa2 = new pizza("Dominoes", 2, 2, false);
        pisa1.printInfo();

        System.out.println(pisa1);
        System.out.println(pisa1.equals(pisa2));

        if(pisa1.equals(pisa2)){
            System.out.println("yuh same");
        }
        System.out.println(pisa1.compareTo(pisa2));
    }
}
