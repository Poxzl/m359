package Unit9.worlkoutlab;
// number of workouts completed, number of workouts skipped, current workout plan week, next workout number,
// total calories burned, total minutes of exercise, 2D array of Workout objects (each row represents 1 week of workouts)


import java.util.ArrayList;

public class WorkoutPlan {
    private int workoutsCompleted;
    private int workoutsSkipped;
    private int curIdxPlan;
    private int nxtWorkoutNumber;
    private int calsBurned;
    private int minsExercise;
    private Workout[][] workouts = new Workout[4][7];

}
