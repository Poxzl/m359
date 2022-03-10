package Unit9.worlkoutlab;

public class Wellness extends Workout {
    private int numStretches;

    public Wellness(int numStretches) {
        this.numStretches = numStretches;
    }

    public Wellness(String name, int workoutNumber, int duration, int numStretches) {
        super(name, workoutNumber, duration);
        this.numStretches = numStretches;
    }

    @Override
    public String toString() {
        return "Wellness{" + "numStretches=" + numStretches + '}';
    }
    public int startExercise(){
        int rand = (int)(Math.random() * 6) + 5;
        return numStretches * rand;
    }

    public int getNumStretches() {
        return numStretches;
    }

    public void setNumStretches(int numStretches) {
        this.numStretches = numStretches;
    }
}
