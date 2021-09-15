package Unit2_UsingObjects.homework.WS1;


public class fruitTester{
    public static void main(String[] args) {
        System.out.println("fhehs");

        Fruit myFruit1 = new Fruit("mango", true, 2);
        myFruit1.printInfo();

        int numServingsFruit1 = myFruit1.getNumServings();
        System.out.println("MyFruit1 can serve:" + numServingsFruit1);



        Fruit myFruit2 = new Fruit("orange", false, 3);
        myFruit2.printInfo();

        myFruit2.setNumServings(5);
        myFruit2.printInfo();


    }
}
