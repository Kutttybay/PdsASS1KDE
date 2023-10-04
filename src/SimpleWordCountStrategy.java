class SimpleWordCountStrategy implements WordCountStrategy {
    @Override
    public int countWords(String text) {
        String[] words = text.split(Configuration.getInstance().getWordSeparator());
        return words.length;
    }
}