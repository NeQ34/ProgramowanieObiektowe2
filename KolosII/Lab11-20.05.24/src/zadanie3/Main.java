package zadanie3;

import java.io.*;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try{
            BufferedReader reader = new BufferedReader(new FileReader("F:\\studia\\semestr-IV\\ProgramowanieObiektowe2\\KolosII\\Lab11-20.05.24\\src\\zadanie3\\corruptedText.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("F:\\studia\\semestr-IV\\ProgramowanieObiektowe2\\KolosII\\Lab11-20.05.24\\src\\zadanie3\\correctText.txt"));

            List<String> filteredWords = reader.lines()
                    .map(line->line.replace(",", ""))
                    .map(line->line.replace(".",""))
                    .flatMap(line-> Arrays.stream(line.split("\\s+")))
                    .filter(word->word.length()>4)
                    .toList();

            for(String word : filteredWords){
                writer.write(word);
                writer.newLine();
            }
        } catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}