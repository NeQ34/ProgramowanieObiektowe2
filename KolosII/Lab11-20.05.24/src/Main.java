import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //metody:
        //filter
        //map
        //peek//sorted
        //distinct
        //limit

        //metody konczace

        //collect(Collectors.toList()) lub -> toList
        //collect(Collectors.toSet()) -> zbierz do seta
        //collect(Collectors.groupingBy(person->person.getAge()))
        //count() ->policz
        //foreach()-> wykonaj akcje dla kazdego elementu
        List<Integer> integers = Arrays.asList(3,5,6,7,5,4);
        integers.forEach(number-> System.out.println(number));

        List<Integer> newIntegers = integers.stream()
                .filter(number->number%2==0)//filtrujemy
                .map(number->number+1)//kazdy elemen zeiekszamy o 1
                .filter(number->number>3)//wybieramy elementy>3
                .sorted(Comparator.reverseOrder())//sortujemy od najwiekszej do najmniejszej
                .distinct()//bierzemy rozne
                .toList();

        newIntegers.forEach(x -> System.out.println("newIntegers: "+x));

        Stream<Integer> integerStream = Stream.of(1,2,3,4,5,6,7);
        integerStream.forEach(e-> System.out.println(e));

        List<Person> people = List.of(
                new Person("aa","bb",12),
                new Person("cc","cc",12),
                new Person("dd","dd",15)
        );
        Map<Integer,List<Person>> collect = people.stream().collect(Collectors.groupingBy(person-> person.getAge()));
        System.out.println(collect);

        Stream.generate(() -> new Random().nextInt()) //() - supplier, z niczego robi coś xD
                .filter(number -> number > 0)
                .filter(number -> number % 2 == 0)
                .limit(50)
                .forEach(number -> System.out.println(number));
        //     .collect(Collectors.toList());

        long count = Stream.iterate(1,number->number+2)
                .limit(50)
                .filter(number->number>20).count();
        System.out.println("Count: "+count);
    }
}
