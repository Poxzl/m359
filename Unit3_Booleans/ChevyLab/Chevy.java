package Unit3_Booleans.ChevyLab;

public class Chevy {
    private int year;
    private double mileage;
    private double mpg;
    private double price;
    private String model;
    private String color;
    private boolean luxStat;
    private boolean stat4WD;
    private boolean sportStat;


    public Chevy() {
        year = 2021;
        mileage = 0;
        mpg = 35;
        price = 16000;
        model = "Trax";
        color = "White";
        luxStat = false;
        stat4WD = false;
        sportStat = false;
    }

    public Chevy(int year, double mileage, double mpg, double price, String model, String color, boolean luxStat, boolean, boolean stat4WD, boolean sportStat) {
        this.year = year;
        this.mileage = mileage;
        this.mpg = mpg;
        this.price = price;
        this.model = model;
        this.color = color;
        this.luxStat = luxStat;
        this.stat4WD = stat4WD;
        this.sportStat = sportStat;
    }


    public double compareTo(Chevy other){
        return this.price - other.price;
    }

    public boolean equalsTo(Chevy other){
        boolean usedEqual = (this.mileage >= 200 == other.mileage >= 200);
        return(this.model.equals(other.model) && this.color.equals(other.color) && usedEqual);
    }


    public String toString() {
        String luxString;
        String string4WD;
        String stringSport;
        String none;
        if(luxStat == true){
            luxString = "-Luxury Package";
        }else luxString = "";
        if(stat4WD == true){
             string4WD = "-4WD Package";
        }else luxString = "";
        if(sportStat == true){
            stringSport = "-Sport Package";
        }else luxString = "";
        if(luxStat || stat4WD || sportStat){
            int useless = 4;
        }else
        return year + " " + model + " (" + color + ") \n\tPRICE:\t\t$" + price + "\nMILES: \t\t" + mileage + "\n FUEL EFFICIENCY:\t\t" + mpg + " mpg\nPACKAGES:\n\t - "
    }
}
