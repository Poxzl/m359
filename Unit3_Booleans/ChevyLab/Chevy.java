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

    public final static String MAKE = "Chevrolet";
    public final static double TAXRATE = 0.122;
    public final static double LUXPRICEINC = 0.2;
    public final static double WDPRICEINC = 3500;
    public final static double SPORTPRICEINC = 0.15;
    public final static double FUELEF = -0.20;




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

    public Chevy(int year, double mileage, double mpg, double price, String model, String color, boolean luxStat, boolean stat4WD, boolean sportStat) {
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
        if (luxStat == true) {
            luxString = "- Luxury Package";
        } else luxString = "";
        if (stat4WD == true) {
            string4WD = "- 4WD Package";
        } else string4WD = "";
        if (sportStat == true) {
            stringSport = "- Sport Package";
        } else stringSport = "";
        if (luxStat || stat4WD || sportStat) {
            none = "";
        } else {
            none = "-None";
        }
        return year + " Chevrolet " + model + " (" + color + ") \n\tPRICE:\t\t\t$" + calcPrice() + "\n\tMILES: \t\t\t" + mileage + "\n\tFUEL EFFICIENCY:" + mpg + " mpg\n\tPACKAGES:\n\t\t" + none + luxString + "\n\t\t" + string4WD + "\n\t\t" + stringSport;
    }

    public double calcPrice(){
        double ogPrice = price;
        if(luxStat){
            price += (ogPrice * LUXPRICEINC);
        }
        if(stat4WD){
            price += (ogPrice + WDPRICEINC);
        }
        if(sportStat) {
            price += (ogPrice * SPORTPRICEINC);
            mpg += (mpg / FUELEF);
        }
        return(price += (price * TAXRATE));
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public double getMpg() {
        return mpg;
    }

    public void setMpg(double mpg) {
        this.mpg = mpg;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isLuxStat() {
        return luxStat;
    }

    public void setLuxStat(boolean luxStat) {
        this.luxStat = luxStat;
    }

    public boolean isStat4WD() {
        return stat4WD;
    }

    public void setStat4WD(boolean stat4WD) {
        this.stat4WD = stat4WD;
    }

    public boolean isSportStat() {
        return sportStat;
    }

    public void setSportStat(boolean sportStat) {
        this.sportStat = sportStat;
    }
}
