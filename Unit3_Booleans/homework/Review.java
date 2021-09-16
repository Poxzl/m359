package Unit3_Booleans.homework;

public class Review {
    private String reviewer;
    private String buisness;
    private int rating;

    public Review(String reviewer, String buisness, int rating) {
        this.reviewer = reviewer;
        this.buisness = buisness;
        this.rating = rating;
    }

    public String toString(){
        String output = reviewer + ", " + buisness + ", " + rating;

        if (rating == 5){
            output += "/nHIGLY GOOD";
        }
        else if (rating == 1){
            output += "/nHIGLY BAD";
        }
        return output;
    }
}
