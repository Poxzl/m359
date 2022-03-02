package Unit9.notes9_3_4;

public class Circle extends Shape{
    private int radius;

    public Circle(String name, String color, int radius){
        super(name, color);
        this.radius = radius;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }

    public String toString(){
        return "" + getColor() + getName() + getRadius();
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
