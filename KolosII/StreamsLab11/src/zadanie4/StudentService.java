package zadanie4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService {
    private ArrayList<Student> studentArrayList = new ArrayList<>();

    public void addStudent(Student student){
        studentArrayList.add(student);
    }
    public List<String> fetchStudentNames(){
        return studentArrayList.stream().map(p->p.getNazwisko()).collect(Collectors.toList());
    }
    public int fetchStudentsAmount(){
        return studentArrayList.size();
    }
    public void showStudentNames(){
        for(int i=0; i<studentArrayList.size(); i++){
            System.out.println((i+1)+" "+studentArrayList.get(i).getImie()+" "+studentArrayList.get(i).getNazwisko());
        }
    }
    public void showStudentsWithSurname(String surname){
        studentArrayList.stream().filter(p->p.getNazwisko().equals(surname)).forEach(System.out::println);
    }
    public List<Student> fetchStudentsWithGradeHigherThan(double grade){
        return studentArrayList.stream().filter(p->p.calculateFinalGrade()>grade).collect(Collectors.toList());
    }
//    public List<Double> fetchStudentsGrades(){
//        return studentArrayList.stream().iterator().
//    }
}
