

import Mental_Health_Simulation_Assistant.user.User;
import java.util.Scanner;
public class Executer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hi, what is your name? ");
        String name = sc.nextLine();

        User user = new User(name);
        Assistant assistant = new Assistant(user);

        while (true) {
            System.out.println("\n*** Checkin Menu ***");
            System.out.println("1. Start a session");
            System.out.println("2. Show mood history");
            System.out.println("3. Terminate the session");
            System.out.print("Enter your choice (1, 2, or 3): "); // <-- CHANGE THIS LINE
            String ch = sc.nextLine();

            switch (ch) { // <-- The input 'ch' should be "1", "2", or "3"
                case "1":
                    assistant.startSession(sc);
                    break;
                case "2":
                    assistant.showMoodHistory();
                    break;
                case "3":
                    System.out.println("I hope you had a great session...");
                    return; // Exit the program
                default:
                    System.out.println("Wrong input, try again.");
                    break;
            }
        }
    }
}