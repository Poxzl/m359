package Unit5.lab;

public class Team1 {
    private String name;

    private Rating teamRating;

    public Team1(String name, Rating teamRating){
        this.name = name;
        this.teamRating = teamRating;
    }

    public String toString(){
        return "Team Name: " + name + "\n" + teamRating.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Rating getTeamRating() {
        return teamRating;
    }

    public void setTeamRating(Rating teamRating) {
        this.teamRating = teamRating;
    }
}
