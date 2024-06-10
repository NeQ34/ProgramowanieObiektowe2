package zadanie2;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PersonService {
    private List<Person> list = List.of(
            new Person("Kamil", "Nowak", 20, "male"),
            new Person("Jan", "Nowak", 30, "male"),
            new Person("Kamila", "Maj", 35, "female"),
            new Person("Justyna", "Nowak", 17, "female")
    );

    public List<Person> findAllMales(){
        return list.stream().filter(p->p.getPlec().equals("male")).toList();
    }
    public List<Person> findAllAdults(){
        return list.stream().filter(p->p.getWiek()>=18).toList();
    }
    public List<String> fetchDistinctSurnamesList(){
        return list.stream()
                .map(p->p.getNazwisko())//zamiana stream->string
                .distinct()
                .toList();
    }
    public List<String> fetchMaleSurnames(){
        return list.stream()
                .filter(p->p.getPlec().equals("male"))
                .map(p->p.getNazwisko())
                .toList();
    }
    public Map<String,List<Person>> groupFamilies(){
        return list.stream().collect(Collectors.groupingBy(p->p.getNazwisko()));
    }
}
