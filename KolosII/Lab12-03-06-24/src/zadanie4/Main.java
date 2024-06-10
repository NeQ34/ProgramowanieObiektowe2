package zadanie4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student s = new Student("Walter","White", Arrays.asList(4.0,4.5,3.0,5.0));
        System.out.println(s.calculateFinalGrade());
        System.out.println(s.calculateFinalGradeStream());
    }
}
