package Unit5.examples.marvel;

public class Power {
    private String name;
    private double powerStrength;

    public Power(String name, double powerStrength){
        this.name = name;
        this.powerStrength = powerStrength;
    }

    public String toString(){
        return "Power: " + name + " Strength: " + powerStrength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPowerStrength() {
        return powerStrength;
    }

    public void setPowerStrength(double powerStrength) {
        this.powerStrength = powerStrength;
    }
}
