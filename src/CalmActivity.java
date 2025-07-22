

/*
 * Will be performing Calming activities.
 * 1.breathingExercise (as of now)
 */
public class CalmActivity {
    public void breathingExercise() {
        System.out.println("We will start with a breathing exercise!");
        for (int i = 0; i < 3; i++) {
            try {
                System.out.println("Breath in...");
                Thread.sleep(3000); // Sleep for 3 seconds
                System.out.println("Hold...");
                Thread.sleep(2000); // Sleep for 2 seconds
                System.out.println("Breath out...");
                Thread.sleep(3000); // Sleep for 3 seconds
            } catch (InterruptedException e) {
                System.out.println("Exercise interrupted!");
                Thread.currentThread().interrupt(); // Restore the interrupted status
                return;
            }
        }
        System.out.println("I hope it is making you feel better.");
    }
}