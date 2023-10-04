class Configuration {
    private static Configuration instance;
    private String wordSeparator = " ";

    private Configuration() {}  // Private constructor to prevent external instantiation

    public static Configuration getInstance() {
        if (instance == null) {
            instance = new Configuration();
        }
        return instance;
    }

    public String getWordSeparator() {
        return wordSeparator;
    }

    public void setWordSeparator(String separator) {
        wordSeparator = separator;
    }
}