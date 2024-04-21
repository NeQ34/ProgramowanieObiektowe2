package zadanie1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> zespoly = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj 7 ulubionych zespołów muzycznych");
        for(int i=1; i<=7; i++){
            System.out.print("Zespół "+i+": "); String zespol = s.nextLine();
            zespoly.add(zespol);
        }
        for(String str : zespoly){
            System.out.println(str);
        }
        System.out.println("Podaj nazwę zespołu czy istnieje na liście: ");
        String zespol = s.nextLine();
        boolean czyIstnieje = zespoly.contains(zespol);
        System.out.println("Czy istnieje zespół "+zespol+"? "+czyIstnieje);
        if(czyIstnieje){
            System.out.println("Zespół "+zespol+" został usunięty");
            zespoly.remove(zespol);
        }else{
            System.out.println("Zespół "+zespol+" został dodany");
            zespoly.add(zespol);
        }
        System.out.println("Lista zespołów: ");
        for(String str : zespoly){
            System.out.println(str);
        }
    }
}
