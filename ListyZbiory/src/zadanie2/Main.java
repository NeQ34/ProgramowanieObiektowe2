package zadanie2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //2
        Set<Osoba> osoby = new HashSet<>();
        osoby.add(new Osoba("958465748","Jesse","Pinkman"));
        osoby.add(new Osoba("746583726","Walter","White"));
        osoby.add(new Osoba("137465846","Heniek","Szwagier"));
        boolean czyDodano = osoby.add(new Osoba("137465846","Jan","Kowalski"));

        System.out.println("Czy dodano osobę z takim samym peselem: "+czyDodano);
        String pesel = "746583726";
        Osoba szukana = new Osoba(pesel,"","");
        boolean czyZnaleziono = osoby.contains(szukana);
        System.out.println("Czy w zbiorze jest osoba o peselu: "+pesel+": "+czyZnaleziono);
        //3
        System.out.println("3/ Posortowany zbiór wg peseli:");
        List<Osoba> sortedOsoby = new ArrayList<>(osoby);
        Collections.sort(sortedOsoby);
        for(Osoba s : sortedOsoby){
            System.out.println(s);
        }
        //4
        System.out.println("TreeSet");
        TreeSet<Osoba> treeSet = new TreeSet<>(osoby);
        for(Osoba s : treeSet){
            System.out.println(s);
        }
        //5
        Comparator<Osoba> komparator = Comparator.comparing(Osoba::getNazwisko);
        System.out.println("5/ Posortowany zbiór wg nazwisk:");
        TreeSet<Osoba> treeSet1 = new TreeSet<>(komparator);
        treeSet1.addAll(osoby);
        for(Osoba s : treeSet1){
            System.out.println(s);
        }
        //7
        Set<Student> students = new HashSet<>();
        students.add(new Student("746593749","Jan","Kowalski",1,3.5));
        students.add(new Student("453728465","Walter","White",2,5.0));
        students.add(new Student("145967843","Jesse","Pinkman",3,4.5));

        //8
        Set<Student> studentTreeSet = new TreeSet<>(students);
        System.out.println("8/ StudentTreeSet:");
        for(Student s : studentTreeSet){
            System.out.println(s);
        }
        //9
        Comparator<Student> studentComparator = Comparator.comparing(Student::getSrednia);
        Set<Student> comparatorStudentTree = new TreeSet<>(studentComparator);
        comparatorStudentTree.addAll(students);
        System.out.println("9/ Studenci posortowani wg średnej:");
        for(Student s : comparatorStudentTree){
            System.out.println(s);
        }
    }
}
