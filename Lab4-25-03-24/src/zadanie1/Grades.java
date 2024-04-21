package zadanie1;
import java.util.*;

public class Grades {
    public static int countNumberOf5(List<Double> gradesList){
        int numberOf5s = 0;
        for(double grade : gradesList){
            if(grade == 5.0){
                numberOf5s++;
            }
        }
        return numberOf5s;
    }

    public static List<Double> getTheBestGrades(List<Double> gradesList){
        List<Double> theBestGradesList = new ArrayList<>();
        for(double grade : gradesList){
            if(grade >= 4){
                theBestGradesList.add(grade);
            }
        }
        return theBestGradesList;
    }

    public static void checkGrade(List<Double> gradesList, double gradeToCheck){
        if(gradesList.contains(gradeToCheck)){
            System.out.println(gradeToCheck + " is on the grades list");
        }else {
            System.out.println(gradeToCheck + " is not on the grades list");
        }
    }

    public static TreeSet<Double> getGradesSetAsTreeSet(){
        TreeSet<Double> gradesSet = new TreeSet<>(); // TreeSet - natural order, HashSet - no order
        gradesSet.add(2.0);
        gradesSet.add(3.0);
        gradesSet.add(3.5);
        gradesSet.add(4.0);
        gradesSet.add(4.5);
        gradesSet.add(5.0);
        return gradesSet;
    }
    public static HashSet<Double> getGradesSetAsHashSet(){
        HashSet<Double> gradesSet = new HashSet<>(); // TreeSet - natural order, HashSet - no order
        gradesSet.add(2.0);
        gradesSet.add(3.0);
        gradesSet.add(3.5);
        gradesSet.add(4.0);
        gradesSet.add(4.5);
        gradesSet.add(5.0);
        return gradesSet;
    }

    public static TreeSet<Double> getGradesTreeSetVs2(){
        TreeSet<Double> gradesSet = new TreeSet<>(); // TreeSet - nadal natural order, pomimo, iż nie dodajemy elementów w kolejności
        gradesSet.add(4.5);
        gradesSet.add(5.0);
        gradesSet.add(2.0);
        gradesSet.add(3.5);
        gradesSet.add(3.0);
        gradesSet.add(4.0);
        return gradesSet;
    }

    public static HashSet<Double> showUniqueGradesAsHashSet(List<Double> gradesList){
        HashSet<Double> gradesSet = new HashSet<>();
        for(double grade : gradesList){ // mniej optymalne rozwiązanie przy użyciu pętli for each
            gradesSet.add(grade);
        }
        return gradesSet;
    }

    public static TreeSet<Double> showUniqueGradesAsTreeSet(List<Double> gradesList){
        TreeSet<Double> gradesSet = new TreeSet<>();
        gradesSet.addAll(gradesList); // bardziej optymalne rozwiązanie przy użyciu metody addAll
        return gradesSet;
    }
}
