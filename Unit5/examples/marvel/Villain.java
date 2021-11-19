package Unit5.examples.marvel;

public class Villain {
    private String name;
    private static int numVillains;
    private static double totalStrength;
    private Power superPower;

    public Villain(String name, Power superPower){
        this.name = name;
        this.superPower = superPower;
        totalStrength += superPower.getPowerStrength();
    }

    public String toString(){
        return "Villain: " + name + "\n" + superPower.toString();
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

    public static int getNumVillains(){return numVillains;}

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }

    public static double getTotalStrength(){return totalStrength;}

    public static double getAverageStrength(){
        return totalStrength / numVillains;
    }
}