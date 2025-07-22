

import Mental_Health_Simulation_Assistant.user.User;
import java.util.Scanner;

public class Assistant {
    private User user;
    private CalmActivity ca;
    private QuoteProvider qp;
    private MoodTracker mt;

    public Assistant(User user) {
        this.user = user;
        this.ca = new CalmActivity();
        this.qp = new QuoteProvider();
        this.mt = new MoodTracker(); // <-- ADD THIS LINE
    }

    public void startSession(Scanner sc) {
        String mood = mt.askMood(sc);
        System.out.println("Logging the mood history...");
        user.addMoodHistory(mood);

        System.out.println(QuoteProvider.getRandomQuote());

        System.out.print("Would you like to do some exercise? (yes/no): ");
        String ans = sc.nextLine().trim().toLowerCase();

        if (ans.equals("yes")) {
            ca.breathingExercise();
        }
        System.out.println("Thank you for initiating this session!");
    }

    public void showMoodHistory() {
        System.out.println("Mood History:");
        for (String mood : user.getMoodHistory()) {
            System.out.println("- " + mood);
        }
    }
}