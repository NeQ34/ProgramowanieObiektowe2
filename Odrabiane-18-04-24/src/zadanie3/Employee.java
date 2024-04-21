package zadanie3;

import java.util.Comparator;

public class Employee {
    private String name;
    private String surname;
    private String job;

    public Employee(String name, String surname, String job) {
        this.name = name;
        this.surname = surname;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Imie: " + name+ " | Nazwisko: " + surname + " | praca: " + job;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
