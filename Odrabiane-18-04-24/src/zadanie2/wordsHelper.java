package zadanie2;

import java.util.Set;
import java.util.TreeSet;

public class wordsHelper {
    private int calculateUniqueWords(String text){
        Set<String> uniqueWords = new TreeSet<>();
        String[] slowa = text.toLowerCase().split(" ");
        for(String s : slowa){
            uniqueWords.add(s);
        }
        return uniqueWords.size();
    }
    public void printStringInfo(String text){
        System.out.println("Ilość unikalnych słów: "+calculateUniqueWords(text));
    }
}
