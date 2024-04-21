package zadanie2;

import java.util.Objects;

public class Osoba implements Comparable<Osoba>{
    private String PESEL;
    private String imie;
    private String nazwisko;

    public Osoba(String PESEL, String imie, String nazwisko) {
        this.PESEL = PESEL;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Osoba osoba = (Osoba) o;
        return Objects.equals(PESEL, osoba.PESEL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PESEL);
    }
    @Override
    public int compareTo(Osoba o) {
        return this.getPESEL().compareTo(o.getPESEL());
    }

    @Override
    public String toString() {
        return "PESEL='" + PESEL + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\''+", ";
    }

    public String getPESEL() {
        return PESEL;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

}
