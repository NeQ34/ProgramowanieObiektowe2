import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        PhoneBook pb = new PhoneBook();
        try{
            BufferedReader br = new BufferedReader(new FileReader("F:\\studia\\semestr-IV\\ProgramowanieObiektowe2\\StreamsZadaniaDodatkowe\\src\\kontakty.txt"));
            String line;
            while((line = br.readLine())!=null){
                String[] tab = line.split(";");
                if(tab.length!=2) pb.addContact(tab[0],null);
                else pb.addContact(tab[0],tab[1]);
            }
            System.out.println(pb.findNameByPhoneNumber("485039485"));
            //System.out.println(pb.findPhoneNumberByNameAndPunishIfNothingFound("123"));
            System.out.println(pb.findPhoneNumberByName("Walter White"));
            //pb.printPhoneBook();
            System.out.println(pb.findPhoneNumberByNameAndPrintPhoneBookIfNothingFound("Ala"));
            System.out.println(pb.findAnyNameByPhoneNumbersStartingWithPrefix("857"));
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}