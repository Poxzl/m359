package Unit9.notes9_3_4;

public class Rectangle extends Shape{
    private int length;
    private int width;

    public Rectangle(String name, String color, int length, int width){
        super(name,color);
        this.length = length;
        this.width = width;
    }

    public Rectangle(String name, String color) {
        super(name, color);
    }
    public double findArea(){
        return length * width;
    }
}
