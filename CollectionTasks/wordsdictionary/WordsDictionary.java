package CollectionTasks.wordsdictionary;
import java.util.*;

public class WordsDictionary {

    TreeMap<Character, TreeSet<String>> dictionary = new TreeMap<>();

    public void add(String word) {
        // check if the word is null
        if (word == null) throw new NullPointerException();

        // check if the word is empty
        word = word.trim(); // delete leading and trailing zeros
        if (word.isEmpty()) throw new IllegalArgumentException();

        word = word.toLowerCase();

        char key = word.charAt(0);

        if (!dictionary.containsKey(key)) {
            dictionary.put(key, new TreeSet<>());
        }
        dictionary.get(word.charAt(0)).add(word);
    }

    public ArrayList<String> getWords(Character key) {
        TreeSet<String> words = dictionary.get(key);
        return new ArrayList<>(words);
    }

    public void printWords(Character key) {
            ArrayList<String> words = this.getWords(key);
            System.out.println("Words Starting with ( " + key + " ) :" + words);
    }

    public void printAllWords() {
        for (char key : dictionary.keySet()) {
            ArrayList<String> words = this.getWords(key);
            System.out.println("Words Starting with ( " + key + " ) :" + words);
        }
    }
}


