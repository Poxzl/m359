package Unit9.examples;

import jdk.nashorn.internal.ir.annotations.Ignore;

public class Entree extends MenuItem{
    private int numSides;
    public Entree(String name, int numSides) {
        super(name);
        this.numSides = numSides;
        System.out.println("Created an Entree with " + numSides + " sides");
    }
    @Override
    public String toString(){
        return "This is a menu item called " + getName() + " and has " + numSides + " sides";
    }
}
