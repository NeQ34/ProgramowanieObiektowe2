package zadanie4;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StudentService {
    private List<Student> studentList = new ArrayList<>();


    public void addStudent(Student student){
        studentList.add(student);
    }
    public ArrayList<String> fetchStudentNames(){
        ArrayList<String> nazwiska = new ArrayList<>();
        for(Student s : studentList){
            nazwiska.add(s.getNazwisko());
        }
        return nazwiska;
    }
    public int fetchStudentsAmount(){
        return studentList.size();
    }
    public void showStudentNames(){
        for(int i=0; i<studentList.size(); i++){
            System.out.println((i+1)+" "+studentList.get(i).getImie()+" "+studentList.get(i).getNazwisko());
        }
    }
    public void showStudentsWithSurname(String surname){
        for(Student s : studentList){
            if(s.getNazwisko().equals(surname))
                System.out.println(s);
        }
    }
    public static List<String> fetchStudentsSurnameList(List<Student> list){
        return list.stream().map(p->p.getNazwisko()).toList(); //xD
    }
    public static List<Student> showStudentsWithSurname(List<Student> list, String surname){
        return list.stream().filter(p->p.getNazwisko().equals(surname)).collect(Collectors.toList());//xD
    }
    public static List<Student> fetchStudentsWithGradeHigherThan(List<Student> list, double grade){
        return list.stream().filter(s->s.calculateFinalGradeStream()>grade).collect(Collectors.toList());// xD
    }
    public ArrayList<Student> fetchStudentsWithGradeHigherThan(double grade){
        ArrayList<Student> studenciZwyzszaSrednia = new ArrayList<>();
        for(Student s : studentList){
            if(s.calculateFinalGrade()>grade){
                studenciZwyzszaSrednia.add(s);
            }
        }
        return studenciZwyzszaSrednia;
    }

}
