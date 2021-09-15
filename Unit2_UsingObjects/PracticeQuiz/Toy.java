package Unit2_UsingObjects.PracticeQuiz;

public class Toy
{
    // *** WRITE CODE HERE ***
    // Part A
    // Create instance variables for the toy name and price
    private String name;
    private double price;


    // *** WRITE CODE HERE ***
    // Part B
    // Create getters & setters for all instance variables
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setName(String aName){
        name = aName;
    }
    public void setPrice(double aPrice){
        price = aPrice;
    }



    // *** WRITE CODE HERE ***
    // Part C
    // Create a full constructor that accepts each instance
    // variable as a parameter
    public Toy(String aName, double aPrice){
        name = aName;
        price = aPrice;
    }

    // *** WRITE CODE HERE ***
    // Part D
    // Create a calcTotal method that adds a 10% tax to the
    // price and returns the total cost
    public double calcTotal(){
        price += price / 10;
        return price;
    }
}
