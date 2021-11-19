package Unit5.examples.marvel;

public class SuperHero {
    private String name;
    private static double totalStrength;
    private Power superPower;
    private static int numHeroes = 0;

    public SuperHero(String name, Power superPower){
        this.name = name;
        this.superPower = superPower;
        totalStrength += superPower.getPowerStrength();
        numHeroes++;

    }

    public String toString(){
        return "SuperHero: " + name + "\n" + superPower.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Power getSuperPower() {
        return superPower;
    }

    public void setSuperPower(Power superPower) {
        if(superPower.getPowerStrength() < this.superPower.getPowerStrength())
        this.superPower = superPower;
    }

    public static int getNumHeroes(){return numHeroes;}

    public static double getTotalStrength(){return totalStrength;}

    public static double getAverageStrength(){
        return totalStrength / numHeroes;
    }
}
