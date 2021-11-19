package Unut6.exampels;

public class Student {
    private  String name;
    private course[] myClasses;

    public Student(String name, course[] myClasses) {
        this.name = name;
        this.myClasses = myClasses;
    }

    public Student(String name) {
        this.name = name;
        this.myClasses = new course[8];
    }

    public String toString(){
        String output = "";
        for (int i = 0; i < this.myClasses.length; i++) {
            if(this.myClasses[i] != null){
                output += this.myClasses[i] + "\n";
            }else output += "NOnWe\n";
        }
        return name + " " + output;
    }
}
