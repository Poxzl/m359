package Unit9.worlkoutlab;
import java.util.Scanner;

public class WorkoutDriver {
    public static void main(String[] args) {
        System.out.println("Welcome!\n How many weeks do you want to exercise?");
        // int weeks =
        Scanner input = new Scanner(System.in);
        int temp = input.nextInt();
        WorkoutPlan plan = new WorkoutPlan(temp);
        for (int i = 0; i < temp; i++) {
            System.out.println("TYPE START TO START!!!!!");
            if(input.next().equalsIgnoreCase("start")){
                plan.WorkoutNextWeek();
            }
        }
    }
}

