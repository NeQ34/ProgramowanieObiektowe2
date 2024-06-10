package zadanie2;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        System.out.println(personService.findAllMales());
        personService.findAllAdults().forEach(e-> System.out.println(e));
        System.out.println(personService.fetchDistinctSurnamesList());
        System.out.println(personService.fetchMaleSurnames());
        Map<String, List<Person>> families = personService.groupFamilies();
        System.out.println(families);
    }
}
