package zadanie2;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonService {
    private List<Person> people= List.of(
            new Person("Jan","Kowalski",45,"mezczyzna"),
            new Person("Walter","White",56,"mezczyzna"),
            new Person("Skyler","White",54,"kobieta"),
            new Person("Ola","Nowak",54,"kobieta"),
            new Person("Jesse","Pinkman",24,"mezczyzna")
    );
    public List<Person> findAllMales(){
        return people.stream().filter(p->p.getPlec().equals("mezczyzna")).collect(Collectors.toList());
    }
    public List<Person> findAllAdults(){
        return people.stream().filter(p->p.getWiek()>=18).collect(Collectors.toList());
    }
    public List<String> fetchDistinctSurnamesList(){
        return people.stream()
                .map(p->p.getNazwisko())//zamiana ze stream na string
                .distinct()
                .collect(Collectors.toList());
    }
    public List<String> fetchMaleSurnames(){
        return people.stream()
                .filter(p->p.getPlec().equals("mezczyzna"))
                .map(p->p.getNazwisko())
                .collect(Collectors.toList());
    }
    public Map<String,List<Person>> groupFamilies(){
        return people.stream().collect(Collectors.groupingBy(p->p.getNazwisko()));
    }
}
