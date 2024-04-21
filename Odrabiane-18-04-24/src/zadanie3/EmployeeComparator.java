package zadanie3;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        int porownanie = o1.getJob().compareTo(o2.getJob());
        if(porownanie!=0) return porownanie;
        else return o1.getSurname().compareTo(o2.getSurname());
    }
}
