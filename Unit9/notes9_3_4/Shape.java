package Unit9.notes9_3_4;

public class Shape {
    private String color;
    private String name;

    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }

    public Shape(){
        this.name = "none";
        this.color = "none";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + " tahts colored " + color;
    }
}
