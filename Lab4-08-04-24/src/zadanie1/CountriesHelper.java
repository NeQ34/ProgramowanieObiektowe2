package zadanie1;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountriesHelper {
    public static void displayCapitals(Map<String,String> countriesCapitalsMap){
        System.out.println("Capitals:");
        for(String s : countriesCapitalsMap.values()){
            System.out.println(s);
        }
    }
    public static void displayCountries(Map<String,String> countriesCapitalsMap){
        System.out.println("Capitals:");
        for(String s : countriesCapitalsMap.keySet()){
            System.out.println(s);
        }
    }
    public static void displayCountriesCapitals(Map<String,String> countriesCapitalsMap){
        System.out.println("Countries - capitals");
        for(Map.Entry<String,String> entry : countriesCapitalsMap.entrySet()){
            System.out.println(entry.getKey()+" - "+entry.getValue());
        }
    }
    //1a:
    public static void displayCapital(Map<String,String> countriesCapitalsMap){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter country");
        String country = input.nextLine();
        if(countriesCapitalsMap.containsKey(country)) System.out.println("Capital city of "+country+" is "+countriesCapitalsMap.get(country));
        else System.out.println("No data abount "+country);
    }
    //1b:
    public void displaySortedMap(Map<String,String> countriesCapitalsMap){
        TreeMap<String,String> countriesCapitalsTreeMap = new TreeMap<>();
        countriesCapitalsTreeMap.putAll(countriesCapitalsMap);
        System.out.println("Map is natural order: "+countriesCapitalsTreeMap);
    }
    //
}
