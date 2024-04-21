package zadanie1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //3
        List<Osoba> osoby = new ArrayList<>();
        osoby.add(new Osoba("847503759","Jesse","CPinkman"));
        osoby.add(new Osoba("740385937","Walter","AWhite"));
        osoby.add(new Osoba("385947214","Heniek","BSzwagier"));

        //4
        Collections.sort(osoby);
        System.out.println("4/ Posortowane osoby wg peseli:");
        for(Osoba s : osoby){
            System.out.println(s);
        }
        //5
        Comparator<Osoba> osobaComparator = Comparator.comparing(Osoba::getNazwisko).thenComparing(Osoba::getImie);
        Collections.sort(osoby,osobaComparator);
        System.out.println("5/ Posortowane osoby wg nazwiska i imienia");
        for(Osoba s : osoby){
            System.out.println(s);
        }
        //6a
        List<Student> students = new ArrayList<>();
        students.add(new Student("847591235","Jan","Kowalski",1,3.5));
        students.add(new Student("475923589","Walter","White",2,4.5));
        students.add(new Student("914576895","Heniek","Szwagier",3,3.0));
        //6b
        System.out.println("Studenci:");
        for(Student s : students){
            System.out.println(s);
        }
        //6c
        Collections.sort(students);
        System.out.println("6c/ posortowani studenci wg peselu:");
        for(Student s : students){
            System.out.println(s);
        }
        //6d
        Comparator<Osoba> studentComparator = Comparator.comparing(Osoba::getImie).thenComparing(Osoba::getNazwisko);
        Collections.sort(students,studentComparator);
        System.out.println("6d/ Posortowani studenci wg imienia i naziwska:");
        for(Student s : students){
            System.out.println(s);
        }
    }
}
