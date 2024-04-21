package zadanie1;

public class Student extends Osoba{
    private int nr_indeksu;
    private double srednia;

    public Student(String pesel, String imie, String nazwisko, int nr_indeksu, double srednia) {
        super(pesel, imie, nazwisko);
        this.nr_indeksu = nr_indeksu;
        this.srednia = srednia;
    }

    @Override
    public String toString() {
        return super.toString()+"nr_indeksu: " + nr_indeksu +
                ", srednia: " + srednia;
    }

    public int getNr_indeksu() {
        return nr_indeksu;
    }

    public double getSrednia() {
        return srednia;
    }
}
