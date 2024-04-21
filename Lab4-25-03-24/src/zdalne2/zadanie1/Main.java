package zdalne2.zadanie1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Set<Person> personTreeSet = new TreeSet<>();
//        personTreeSet.add(new Person("22222222223", "Maria", "Nowak"));
//        personTreeSet.add(new Person("33333333333", "Jan", "Kowalski"));
//        personTreeSet.add(new Person("55555555555", "Paweł", "Wolski"));
//        personTreeSet.add(new Person("11111111111", "Paweł", "Makowski"));
//        personTreeSet.add(new Person("22222222222", "Anna", "Nowak-Jezior"));
//        personTreeSet.add(new Person("82222222222", "Maria", "Nowak-Jezior"));
//        personTreeSet.add(new Person("42222222222", "Jan", "Nowak"));
//        System.out.println("PersonTreeSet");
//        for(Person person : personTreeSet){
//           System.out.println(person);
//        }
//
//        List<Person> listaosob = new ArrayList<>();
//        listaosob.add(new Person("23628384429", "Jan", "Kowalski"));
//        listaosob.add(new Person("12345678901", "Maria", "Nowak"));
//        listaosob.add(new Person("87342784678", "Adam", "Kowalski"));
//        listaosob.add(new Person("12345678999", "Maria", "Polak"));
//        listaosob.add(new Person("87342784678", "Adam", "Pudełko"));
//        System.out.println("Lista: ");
//        System.out.println(listaosob);
//        System.out.println("Posortowana: ");
//        Collections.sort(listaosob);
//        System.out.println(listaosob);
//        System.out.println("Posortowana reverseOrder: ");
//        Collections.sort(listaosob, Collections.reverseOrder());
//        System.out.println(listaosob);

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("95746584731","Jesse","Pinkman",1,3.5));
        studentList.add(new Student("94628174811","Walter","White",2,5.0));
        studentList.add(new Student("72517483627","Skyler","White",3,4.0));
        studentList.add(new Student("74638563859","Hank","Schrader",4,4.5));

        for(Student s : studentList) System.out.println(s);
        Collections.sort(studentList);
        System.out.println("Posortowana wg peselu:");
        for(Student s : studentList) System.out.println(s);
        System.out.println("Posortowana wg nazwiska i imienia:");
        Comparator<Person> com = Comparator.comparing(Person::getSurname).thenComparing(Person::getName);
        Collections.sort(studentList,com);
        for(Person s : studentList){
            System.out.println(s);
        }
    }

}