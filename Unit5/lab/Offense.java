package Unit5.lab;
// Johan, Arjun
//Mr. Moon
//Period 3
//The purpose of this lab is to create basketball teams with random skill levels, and then compare two of them
//to see which
public class Offense {
    private int shootRating;
    private int layupRating;

    public Offense(int shootRating, int layupRating)
    {
        this.shootRating = shootRating;
        this.layupRating = layupRating;
    }

    // getters and setters

    /**
     * prints out team info
     * @return
     */
    public String toString(){
        return "Shoot Rating: " + shootRating + ", Layup Rating: " + layupRating;
    }

    public int getShootRating() {
        return shootRating;
    }

    public void setShootRating(int shootRating) {
        this.shootRating = shootRating;
    }

    public int getLayupRating() {
        return layupRating;
    }

    public void setLayupRating(int layupRating) { this.layupRating = layupRating; }
}


