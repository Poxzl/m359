package Unit5.lab;
// Johan, Arjun
//Mr. Moon
//Period 3
//The purpose of this lab is to create basketball teams with random skill levels, and then compare two of them
//to see which
public class Team {
    private String name;
    private Defense def;
    private Offense off;
    private static double intensity;
    private static int possiblePoints;
    public Team(String name, Offense off, Defense def){
        this.name = name;
        this.off = off;
        this.def = def;
        intensity += off.getLayupRating() + off.getShootRating();
        intensity += def.getBlockRating() + def.getStealRating();
        possiblePoints += 40;
    }

    /**
     * calculates intensity out of the possible points.
     * @return
     */
    public static String calcIntensity(){
        return " Intensity: " + intensity + " on a scale of 0 to " + possiblePoints;
    }


    /**
     * prints out team info
     * @return
     */
    public String toString(){
        return "Team Name: " + name + "\n" +"Offense: " + off + "\n" + "Defense: " + def;
    }

    // getters and setters
    public String getName() {

        return name;
    }

    // getters and setters

    public void setName(String name) {
        this.name = name;
    }

    public Defense getDef() {
        return def;
    }

    public void setDef(Defense def) {
        this.def = def;
    }

    public Offense getOff() {
        return off;
    }

    public void setOff(Offense off) {
        this.off = off;
    }

    public static double getIntensity() {
        return intensity;
    }

}


