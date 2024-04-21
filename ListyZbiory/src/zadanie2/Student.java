package zadanie2;

public class Student extends Osoba{
    private int nrInd;
    private double srednia;

    public Student(String PESEL, String imie, String nazwisko, int nrInd, double srednia) {
        super(PESEL, imie, nazwisko);
        this.nrInd = nrInd;
        this.srednia = srednia;
    }

    @Override
    public String toString() {
        return super.toString()+
                "nrInd=" + nrInd +
                ", srednia=" + srednia;
    }

    public int getNrInd() {
        return nrInd;
    }

    public double getSrednia() {
        return srednia;
    }
}
