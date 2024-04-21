package zadanie2;

public class Main {
    public static void main(String[] args) {
        WordsHelper w = new WordsHelper();
        String word = "alaMaKotah";

        System.out.println("Ilosc unikalnych znakow: "+w.getUniqueWords(word));
        System.out.println("Zbior unikalnych znakow: "+w.getUniqueWords2(word));
    }
}
