package zadanie4;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //a
        Map<String, Double> faktura = new HashMap<>();
        try{
            Scanner s = new Scanner(new File("F:\\studia\\semestr-IV\\ProgramowanieObiektowe2\\Odrabiane-18-04-24\\src\\zadanie4\\zlecenia.txt"));
            String line;
            while(s.hasNext()){
                line = s.nextLine();
                String[] tab = line.split(";");
                if(faktura.containsKey(tab[0])){
                    Double value = faktura.get(tab[0]);
                    Double suma = value+Double.parseDouble(tab[1]);
                    faktura.put(tab[0],suma);
                }else faktura.put(tab[0], Double.parseDouble(tab[1]));
            }
        }catch(IOException e){
            e.printStackTrace();
        }
        for(Map.Entry<String, Double> entry : faktura.entrySet()){
            System.out.println("pesel: "+entry.getKey()+" kwota: "+entry.getValue());
        }

        //b
        List<Employee> employeeList = new ArrayList<>();
        try{
            Scanner s = new Scanner(new File("F:\\studia\\semestr-IV\\ProgramowanieObiektowe2\\Odrabiane-18-04-24\\src\\zadanie4\\pracownicy.txt"));
            String line;
            while(s.hasNext()){
                line = s.nextLine();
                String[] tab = line.split(";");
                employeeList.add(new Employee(tab[0],tab[1],tab[2],tab[3],Double.parseDouble(tab[4])));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        for(Employee e : employeeList){
            if(faktura.containsKey(e.getPesel())){
                Double kwotaZfaktury = faktura.get(e.getPesel());//tu jest suma kwot tych samych peseli z punktu A
                Double kwotaPracownika = e.getSalary();
                e.setTotalInvoicesAmount(kwotaZfaktury+kwotaPracownika);
            }
        }
        for(Employee e : employeeList){
            System.out.println(e);
        }
    }
}
