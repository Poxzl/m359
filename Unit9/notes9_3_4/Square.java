package Unit9.notes9_3_4;

public class Square extends Rectangle{
    private int sideLength;
    public Square(String name, String color, int sideLength){
        super(name, color, sideLength, sideLength);
        this.sideLength = sideLength;
    }

    public String toString(){
        return getColor() + " " + getName() + " with a side length of " + sideLength;
    }
    public void scaleSize(double scaler){
        this.sideLength = (int)(this.sideLength * scaler);
    }
}
