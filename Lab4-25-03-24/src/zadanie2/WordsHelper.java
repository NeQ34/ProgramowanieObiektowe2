package zadanie2;

import java.util.TreeSet;

public class WordsHelper {
    public int getUniqueWords(String word){
        TreeSet<Character> uniqueWords = new TreeSet<>();
        char[] tab = word.toCharArray();
        for(Character c : tab){
            uniqueWords.add(c);
        }
        return uniqueWords.size();
    }
    public TreeSet<Character> getUniqueWords2(String word){
        TreeSet<Character> uniqueWords = new TreeSet<>();
        char[] tab = word.toCharArray();
        for(Character c : tab){
            uniqueWords.add(c);
        }
        return uniqueWords;
    }
}
