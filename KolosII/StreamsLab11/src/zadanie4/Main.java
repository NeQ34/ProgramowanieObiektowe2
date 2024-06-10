package zadanie4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentService sw = new StudentService();
        sw.addStudent(new Student("Walter","White", Arrays.asList(5.0,4.5,5.0)));
        sw.addStudent(new Student("Skyler","White", Arrays.asList(4.5,3.0,3.5)));
        sw.addStudent(new Student("Jesse","Pinkman", Arrays.asList(3.0,4.0,5.0)));

        List<String> nazwiska = sw.fetchStudentNames();
        System.out.println(nazwiska);

        System.out.println("Ilosc studentow: "+sw.fetchStudentsAmount());

        sw.showStudentNames();

        System.out.println("Studenci z nazwiskiem white:");
        sw.showStudentsWithSurname("White");

        List<Student> zWyzszaSrednia = sw.fetchStudentsWithGradeHigherThan(4.0);
        System.out.println("Studenci z wyzsza serdnia 4.0: "+zWyzszaSrednia);
    }
}
