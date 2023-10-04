import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Configuration config = Configuration.getInstance();
        config.setWordSeparator(" ");


        int randomWordCount = new Random().nextInt(100) + 1;
        StringBuilder randomText = new StringBuilder();


        for (int i = 0; i < randomWordCount; i++) {
            int wordLength = new Random().nextInt(10) + 1;  // Random word length between 1 and 10
            for (int j = 0; j < wordLength; j++) {
                char randomChar = (char) (new Random().nextInt(26) + 'a');
                randomText.append(randomChar);
            }
            if (i < randomWordCount - 1) {
                randomText.append(config.getWordSeparator());
            }
        }

        System.out.println("Random text with spaces: " + randomText.toString());


        WordCountStrategy wordCountStrategy = new SimpleWordCountStrategy();

        int wordCount = wordCountStrategy.countWords(randomText.toString());
        System.out.println("Word count: " + wordCount);
    }
}