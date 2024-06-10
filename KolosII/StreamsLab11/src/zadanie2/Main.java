package zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PersonService ps = new PersonService();
        System.out.println("males: "+ps.findAllMales());
        System.out.println("adults: "+ps.findAllAdults());
        System.out.println("rozne nazwiska: "+ps.fetchDistinctSurnamesList());
        System.out.println("nazwiska mezczyzn: "+ps.fetchMaleSurnames());
        System.out.println("rodziny:");
        Map<String,List<Person>> families = ps.groupFamilies();
        for(Map.Entry<String, List<Person>> key : families.entrySet()){
            System.out.println(key.getKey()+" "+key.getValue());
        }
    }
}
