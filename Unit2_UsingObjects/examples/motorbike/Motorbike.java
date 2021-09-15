package Unit2_UsingObjects.examples.motorbike;

public class Motorbike {
    //instance variables
    private int horsepower;
    private String color;

    public int getHorsepower(){
        return horsepower;
    }

    public void setHorsepower(int hp) {
        horsepower = hp;
    }

    public Motorbike(int hp, String anColor){
        horsepower = hp;
        color = anColor;
    }

    public Motorbike(int hp){
        horsepower = hp;
    }

    public void addHorsePower(){
        horsepower += 10;
    }


}
