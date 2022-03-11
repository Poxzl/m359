package Unit9.worlkoutlab;
// number of workouts completed, number of workouts skipped, current workout plan week, next workout number,
// total calories burned, total minutes of exercise, 2D array of Workout objects (each row represents 1 week of workouts)


import java.util.ArrayList;

public class WorkoutPlan {
    private int workoutsCompleted;
    private int workoutsSkipped;
    private int curWeek;
    private int nxtWorkoutNumber;
    private int calsBurned;
    private int minsExercise;
    private Workout[][] workouts;

    public WorkoutPlan(int numWeeks){
        fillWeeks(numWeeks);
    }

    private void fillWeeks(int numWeeks){
        workouts = new Workout[numWeeks][7];
        for (int i = 0; i < numWeeks; i++) {
            for (int j = 0; j < 7; j++) {
                int choice = (int) Math.random() * 3;
                if(choice == 1){
                    workouts[i][j] = new Cardio("Running", 0, (int)Math.random() * 30 + 10, 0, Math.random() * 3 + 1);
                }
                if(choice == 2){
                    workouts[i][j] = new Strength("Lifting", 0, (int)Math.random() * 46 + 15, (int)Math.random() * 140 + 95);
                }
                if(choice == 3){
                    workouts[i][j] = new Wellness("Stretching", 0, (int)Math.random() * 31 + 30, (int)Math.random() * 5 + 8);
                }
                System.out.println(workouts[i][j]);
            }
        }
    }
}
