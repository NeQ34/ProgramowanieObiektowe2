package zadanie2;

public class Person {
    private String imie;
    private String nazwisko;
    private int wiek;
    private String plec;

    public Person(String imie, String nazwisko, int wiek, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "imie: " + imie +
                ", nazwisko: " + nazwisko +
                ", wiek: " + wiek +
                ", plec: " + plec+" ";
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }
}
