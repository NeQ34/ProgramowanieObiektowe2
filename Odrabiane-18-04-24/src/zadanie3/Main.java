package zadanie3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Jan","Kowalski","programista");
        Employee e2 = new Employee("Walter","White","chemik");
        Employee e3 = new Employee("Jesse","Pinkman","chemik");
        Employee e4 = new Employee("Heniek","Schreader","chemik");
        Employee e5 = new Employee("Michal","Wisniewski","programista");

        Set<Employee> employees = new TreeSet<>(new EmployeeComparator());
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);

        System.out.println("Posortowane obiekty:");
        for(Employee e : employees){
            System.out.println(e);
        }
    }
}
