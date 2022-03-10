package Unit9.worlkoutlab;

public class Strength extends Workout {
    private int weight;

    public Strength(int weight) {
        this.weight = weight;
    }

    public Strength(String name, int workoutNumber, int duration, int weight) {
        super(name, workoutNumber, duration);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Strength{" + "weight=" + weight + '}';
    }

    public int startExercise(){
        int rand = (int)(Math.random() * 3) + 1;
        return weight * rand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
