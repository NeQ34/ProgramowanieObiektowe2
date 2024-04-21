package zadanie1;

import com.sun.source.tree.Tree;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        CountriesHelper ch = new CountriesHelper();

        Scanner s = new Scanner(System.in);
        System.out.println("Podaj nazwę kraju:");
        //String kraj = s.nextLine();

        //klucz,wartość(key,value)
        //klucz musi być uikatowy, wartości nie
        //moze byc treemap
        HashMap<String,String> europeanCountriesMap = new HashMap<>();
        europeanCountriesMap.put("Polska","Warszawa");
        europeanCountriesMap.put("Francja","Paryż");
        europeanCountriesMap.put("Niemcy","Berlin");
        europeanCountriesMap.put("Rosja","Moskwa");
        //System.out.println(europeanCountriesMap.get("Polska"));
        //System.out.println(europeanCountriesMap);

        //System.out.println(europeanCountriesMap.keySet());//wyswietli tylko klucze

        ch.displaySortedMap(europeanCountriesMap);

    }
    public static void importCountries(String countryName) throws IOException {
        FileReader f = new FileReader("D:\\ProgramowanieObiektoweIIGr1\\Lab4-08-04-24\\src\\zadanie1\\stolice.txt");
        BufferedReader br = new BufferedReader(f);
        HashMap<String,String> KrajeIStolice = new HashMap<>();
        String line;
        while((line = br.readLine())!=null){
            String[] sp = line.split("/");
            KrajeIStolice.put(sp[0],sp[1]);
        }
        System.out.println("Stolica:"+KrajeIStolice.get(countryName));
    }
    public static void krajeAlfabetycznie() throws IOException {
        FileReader f = new FileReader("D:\\ProgramowanieObiektoweIIGr1\\Lab4-08-04-24\\src\\zadanie1\\stolice.txt");
        BufferedReader br = new BufferedReader(f);
        TreeSet countriesCapitalsTree = new TreeSet();
        String line;
    }
}
