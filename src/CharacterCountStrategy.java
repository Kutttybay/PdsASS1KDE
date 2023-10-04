class CharacterCountStrategy implements WordCountStrategy {
    @Override
    public int countWords(String text) {
        return text.length();
    }
}