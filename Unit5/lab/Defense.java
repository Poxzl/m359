package Unit5.lab;
// Johan, Arjun
//Mr. Moon
//Period 3
//The purpose of this lab is to create basketball teams with random skill levels, and then compare two of them
//to see which
public class Defense {
    private int blockRating;
    private int stealRating;

    public Defense(int blockRating, int stealRating){
        this.blockRating = blockRating;
        this.stealRating = stealRating;
    }

    // getters and setters

    /**
     * prints out team info
     * @return
     */
    public String toString(){
       return "Block Rating: " + blockRating +  ", Steal Rating: " + stealRating;
    }

    public int getBlockRating() {
        return blockRating;
    }

    public void setBlockRating(int blockRating) {
        this.blockRating = blockRating;
    }

    public int getStealRating() {
        return stealRating;
    }

    public void setStealRating(int stealRating) { this.stealRating = stealRating;}
}
