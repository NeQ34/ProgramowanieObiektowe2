package zadanie1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountriesFileService {
    public static Map<String,String> getCountriesCapitalsMap(String filename){
        Map<String,String> countriesCapitalsMap = new HashMap<>();
        try{
            Scanner s = new Scanner(new File(filename));
            while(s.hasNextLine()){
                Scanner line = new Scanner(s.nextLine()).useDelimiter("/");
                countriesCapitalsMap.put(line.next(),line.next());
            }
            s.close();
        }catch (FileNotFoundException e){
            System.out.println("Error while reading "+filename);
        }
        return countriesCapitalsMap;
    }
}
