package zadanie1;

public class Osoba implements Comparable<Osoba>{
    private String pesel;
    private String imie;
    private String nazwisko;

    public Osoba(String pesel, String imie, String nazwisko) {
        this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public int compareTo(Osoba o) {
        return this.getPesel().compareTo(o.getPesel());
    }

    @Override
    public String toString() {
        return "pesel: " + pesel + ", " +
                "imie: " + imie + ", " +
                "nazwisko: " + nazwisko+", ";
    }

    public String getPesel() {
        return pesel;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }
}
