package Unit9.worlkoutlab;

public class Cardio extends Workout{
    private double distance;
    private double speed;

    public Cardio(double distance, double speed) {
        this.distance = distance;
        this.speed = speed;
    }

    public Cardio(String name, int workoutNumber, int duration, double distance, double speed) {
        super(name, workoutNumber, duration);
        double dist = speed * (60 / duration);
        this.distance = dist;
        this.speed = speed;
    }



    public String toString() {
        return "Cardio{" +
                "distance=" + distance +
                ", speed=" + speed +
                '}';
    }
    @Override
    public int startExercise(){
        double calpermile = (Math.random() * 41) + 80;
        return (int) calpermile;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}
