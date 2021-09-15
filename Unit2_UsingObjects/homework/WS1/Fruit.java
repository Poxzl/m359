package Unit2_UsingObjects.homework.WS1;

public class Fruit {
    private String name;
    private boolean ripe;
    private int numServings;

    public Fruit(String aName, boolean isRipe, int aNumServings){
        name = aName;
        ripe = isRipe;
        numServings = aNumServings;
    }

    public void printInfo(){
        System.out.println(name);
        System.out.println(ripe);
        System.out.println(numServings);
        System.out.println("");
    }

    public int getNumServings(){
        return numServings;
    }

    public String getString() {
        return name;
    }

    //setters
    public void setNumServings(int numServ){
        numServings = numServ;
    }

}