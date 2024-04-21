package zdalne2.zadanie1;

public class Student extends Person{
    private int nr_indeksu;
    private double srednia;

    public Student(String PESEL, String name, String surname, int nr_indeksu, double srednia) {
        super(PESEL, name, surname);
        this.nr_indeksu = nr_indeksu;
        this.srednia = srednia;
    }
}
