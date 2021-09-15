package Unit3_Booleans.wxamples;

public class pizza {
    private String store;
    private int numToppings;
    private int inches;
    private boolean isDeepDish;

    public pizza(String theStore, int numInches, int toppings, boolean deepDish){
        store = theStore;
        numToppings = toppings;
        inches = numInches;
        isDeepDish = deepDish;
    }


    public pizza(String theStore, int numInches, boolean deepDish){
        store = theStore;
        numToppings = 0;
        inches = numInches;
        isDeepDish = deepDish;
    }



    //returns true if the two pizzas are equal
    public boolean equals(pizza other){
        return (this.store.equals(other.store));
    }

    public void printInfo(){
        System.out.println(this.store);
        System.out.println(this.inches);
        System.out.println(this.numToppings);
        System.out.println(this.isDeepDish);
    }

    //create an output with the pizzas onfo, but instead of printing it, return it
    public String toString(){
        String output = this.inches + "inch pizzas from jo " + this.store;
        output += "toppings: " + this.numToppings;
        output += "has deep dish? " + this.isDeepDish;
        return output;
    }



    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public int getNumToppings() {
        return numToppings;
    }

    public void setNumToppings(int numToppings) {
        this.numToppings = numToppings;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public boolean isDeepDish() {
        return isDeepDish;
    }

    public void setDeepDish(boolean deepDish) {
        isDeepDish = deepDish;
    }

    
}
