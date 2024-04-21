package zadanie2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Podaj jakiś tekst:"); String text = s.nextLine();
        wordsHelper wh = new wordsHelper();
        wh.printStringInfo(text);
    }
}
