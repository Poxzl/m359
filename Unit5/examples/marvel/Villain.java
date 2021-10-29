package Unit5.examples.marvel;

public class Villain {
    private String name;

    private Power superPower;

    public Villain(String name, Power superPower){
        this.name = name;
        this.superPower = superPower;
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

    public void setSuperPower(Power superPower) {
        this.superPower = superPower;
    }
}