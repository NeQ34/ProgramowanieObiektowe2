package zadanie4;

import java.util.List;
import java.util.OptionalDouble;

public class Student {
    private String imie;
    private String nazwisko;
    private List<Double> listaOcen;

    public Student(String imie, String nazwisko, List<Double> listaOcen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.listaOcen = listaOcen;
    }
    public double calculateFinalGrade(){
        if(listaOcen.size()==0) return 0;
        double sum=0;
        for(double g : listaOcen){
            sum+=g;
        }
        return sum/listaOcen.size();
    }
    public double calculateFinalGradeStream(){
        return listaOcen.stream().mapToDouble(Double::doubleValue).average().orElse(0);
    }

    @Override
    public String toString() {
        return "imie: " + imie + '\'' +
                "nazwisko: " + nazwisko + '\'' +
                "listaOcen: " + listaOcen;
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

    public List<Double> getListaOcen() {
        return listaOcen;
    }

    public void setListaOcen(List<Double> listaOcen) {
        this.listaOcen = listaOcen;
    }
}
