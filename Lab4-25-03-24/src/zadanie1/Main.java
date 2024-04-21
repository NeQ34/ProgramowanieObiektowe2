package zadanie1;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Przykłady do przetestowania: 
        ArrayList<Integer> exampleList = new ArrayList<>();
        exampleList.add(4);
        exampleList.add(2);
        exampleList.add(6);
        exampleList.add(17);
        exampleList.add(10);
        TreeSet<Integer> exampleTreeSet = new TreeSet<>();
        exampleTreeSet.addAll(exampleList); //dodajemy wszystkie elementy z przekazanej parametrem kolekcji, dodatkowo sortuje od najmn. do najw xD
        HashSet<Integer> exampleHashSet = new HashSet<>();// tu juz tak ladnie nie sortuje :(
        exampleHashSet.addAll(exampleList);
        System.out.println("1.exampleTreeSet " + exampleTreeSet); // TreeSet - elementy wyświetlone w domyślnym porządku naturalnym
        System.out.println("2.exampleHashSet " + exampleHashSet); // HashSet - brak gwarancji kolejności wyświetlania elementów

        // dodajemy kolejne elementy:
        exampleTreeSet.add(15);
        exampleTreeSet.add(-5);
        exampleHashSet.add(15);
        exampleHashSet.add(-5);
        System.out.println("3.exampleTreeSet " + exampleTreeSet); // natural order, elementy 15 i -5 są uporządkowane
        System.out.println("4.exampleHashSet " + exampleHashSet); // random order, elementy nie są posortowane

        System.out.println("After adding number 6 once again");
        exampleTreeSet.add(6);
        exampleHashSet.add(6);
        System.out.println("5.exampleTreeSet " + exampleTreeSet); // brak duplikatów !
        System.out.println("6.exampleHashSet " + exampleHashSet); // brak duplikatów !

        // brak metody get oraz add(index,element) - Set nie posiada indeksacji
        // brak metod pozwalających na pobranie elementu z setu używajac indeksów


        // zadanie 1
        System.out.println("---------------------------------------------------------------");
        ArrayList<Double> studentGrades = new ArrayList();
        studentGrades.add(4.5);
        studentGrades.add(4.5);
        studentGrades.add(4.0);
        studentGrades.add(3.5);
        studentGrades.add(4.5);

        System.out.println("number of 5: " + Grades.countNumberOf5(studentGrades));

        studentGrades.add(5.0);
        studentGrades.add(5.0);
        System.out.println("number of 5: " + Grades.countNumberOf5(studentGrades));

        System.out.println("getTheBestGrades");
        for(double grade : Grades.getTheBestGrades(studentGrades)){
            System.out.println(grade);
        }

        Grades.checkGrade(studentGrades,4.5);
        Grades.checkGrade(studentGrades,2.5);






        // SETS
        TreeSet<Double> gradesSet = Grades.getGradesSetAsTreeSet(); // TreeSet
        System.out.println("gradesTreeSet " + gradesSet);

        HashSet<Double> gradesHashSet = Grades.getGradesSetAsHashSet(); // HashSet
        System.out.println("gradesHashSet " + gradesHashSet);

        TreeSet<Double> gradesSetVs2 = Grades.getGradesTreeSetVs2(); // TreeSet
        System.out.println("getGradesTreeSetVs2 " + gradesSetVs2);

        gradesSet.add(4.0);
        System.out.println("gradesSet after adding 4.0: " + gradesSet);

        System.out.println("showUniqueGradesAsHashSet");
        for(double grade : Grades.showUniqueGradesAsHashSet(studentGrades)){
            System.out.println(grade);
        }

        System.out.println("showUniqueGradesAsTreeSet");
        for(double grade : Grades.showUniqueGradesAsTreeSet(studentGrades)){
            System.out.println(grade);
        }
    }
}