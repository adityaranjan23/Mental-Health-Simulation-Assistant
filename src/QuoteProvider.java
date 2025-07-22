

import java.util.Random;

/*
 * 1.getRandomQuote
 */
public class QuoteProvider {
    private static String quotes[] = {
        "You are stronger than you think.",
        "This too shall pass.",
        "Breathe. You're doing okay.",
        "It's okay to ask for help.",
        "You matter. Your feelings are valid.",
        "Progress, not perfection."
    };

    public static String getRandomQuote() {
        Random rand = new Random();
        return quotes[rand.nextInt(quotes.length)];
    }
}