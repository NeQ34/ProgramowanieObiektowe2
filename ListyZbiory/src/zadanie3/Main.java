package zadanie3;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("alamakota "+ileUnikatowychZnakow("alamakota"));
    }
    public static int ileUnikatowychZnakow(String s){
        Set<Character> uniqueWords = new TreeSet<>();
        char[] tab = s.toCharArray();
        for(Character c : tab){
            uniqueWords.add(c);
        }
        return uniqueWords.size();
    }
}
