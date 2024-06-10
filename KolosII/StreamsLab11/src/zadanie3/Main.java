package zadanie3;

import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("F:\\studia\\semestr-IV\\ProgramowanieObiektowe2\\KolosII\\StreamsLab11\\src\\zadanie3\\corruptedText.txt"));
            FileWriter fw = new FileWriter("F:\\studia\\semestr-IV\\ProgramowanieObiektowe2\\KolosII\\StreamsLab11\\src\\zadanie3\\correctText.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            List<String> correctWords = br.lines()
                    .map(line->line.replace(",",""))
                    .map(line->line.replace(".",""))
                    .flatMap(line-> Arrays.stream(line.split("\\s")))
                    .filter(word->word.length()>4)
                    .collect(Collectors.toList());

            for(String w : correctWords){
                System.out.println(w);
                bw.write(w);
                bw.newLine();
            }
            bw.close();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
