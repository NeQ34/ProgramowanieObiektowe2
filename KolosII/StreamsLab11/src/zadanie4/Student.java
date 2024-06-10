package zadanie4;

import java.util.List;

public class Student {
    private String imie;
    private String nazwisko;
    private List<Double> oceny;

    public Student(String imie, String nazwisko, List<Double> oceny) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.oceny = oceny;
    }
    public double calculateFinalGrade(){
        return oceny.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    @Override
    public String toString() {
        return "imie: " + imie +
                ", nazwisko: " + nazwisko +
                ", oceny: " + oceny;
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

    public List<Double> getOceny() {
        return oceny;
    }

    public void setOceny(List<Double> oceny) {
        this.oceny = oceny;
    }
}
