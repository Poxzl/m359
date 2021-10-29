package Unit5.lab;

public class Rating {
    private String name;
    private int teamScore;

    public Rating(int offense, int defense){
        this.name = name;
        this.teamScore = teamScore;
    }

    public String toString(){
        return ": " + name + " Strength: " + powerStrength;
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
