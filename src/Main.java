import java.util.Random;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Configuration config = Configuration.getInstance();
        config.setWordSeparator(" ");  // Set the word separator

        String text = "This is a simple example of a text processing application.";

        // Choose a counting strategy (SimpleWordCountStrategy or CharacterCountStrategy)
        WordCountStrategy wordCountStrategy = new SimpleWordCountStrategy();

        // Generate a random number between 1 and 100 as the text length
        int randomTextLength = new Random().nextInt(100) + 1;
        StringBuilder randomText = new StringBuilder();

        // Generate random characters for the text
        for (int i = 0; i < randomTextLength; i++) {
            char randomChar = (char) (new Random().nextInt(26) + 'a');
            randomText.append(randomChar);
        }

        System.out.println("Random text: " + randomText.toString());

        int wordCount = wordCountStrategy.countWords(randomText.toString());
        System.out.println("Word count: " + wordCount);
    }
}