package Unit9.worlkoutlab;

public class Workout {
    private String name;
    private int workoutNumber;
    private int duration;

    public Workout(){
        name = "None";
        workoutNumber = 0;
        duration = 0;
    }

    public Workout(String name, int workoutNumber, int duration) {
        this.name = name;
        this.workoutNumber = workoutNumber;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Workout #" + workoutNumber + ":\t\t " + name + "\t " + duration;
    }
    public int startExercise(){
        System.out.println("Starting a workout!");
        return 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkoutNumber() {
        return workoutNumber;
    }

    public void setWorkoutNumber(int workoutNumber) {
        this.workoutNumber = workoutNumber;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
