public class Main {
    public static void main(String[] args) {
        Configuration config = Configuration.getInstance();
        config.setWordSeparator(" ");  // Set the word separator

        String text = "This is a simple example of a text processing application.";

        // Choose a counting strategy (SimpleWordCountStrategy or CharacterCountStrategy)
        WordCountStrategy wordCountStrategy = new SimpleWordCountStrategy();

        int wordCount = wordCountStrategy.countWords(text);
        System.out.println("Word count: " + wordCount);
    }
}