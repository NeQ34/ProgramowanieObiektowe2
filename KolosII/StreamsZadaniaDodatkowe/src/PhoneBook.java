import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class PhoneBook {
    private HashMap<String,String> kontakty = new HashMap<>();
    //klucz to nazwa kontaktu
    //wartosc to numer osoby
    public void addContact(String nazwa, String numer){
        kontakty.put(nazwa,numer);
    }
    public Optional<String> findPhoneNumberByName(String nazwa){
        return kontakty.entrySet().stream()
                .filter(e->e.getKey().equals(nazwa))
                .map(Map.Entry::getValue)
                .findFirst();
    }
    public String findPhoneNumberByNameAndPunishIfNothingFound(String nazwa){
        return kontakty.entrySet().stream()
                .filter(e->e.getKey().equals(nazwa))
                .map(Map.Entry::getValue)
                .findFirst()
                .orElseThrow(()-> new IllegalArgumentException("Brak numeru telefonu"));
    }
    public String findNameByPhoneNumber(String numer){
        return kontakty.entrySet().stream()
                .filter(e->e.getValue().equals(numer))
                .map(Map.Entry::getKey)
                .findFirst()
                .orElse("Brak kontaktu");
    }
    public void printPhoneBook(){
        kontakty.entrySet().stream().forEach(e-> System.out.println(e.getKey()+" "+e.getValue()));
    }
    public String findPhoneNumberByNameAndPrintPhoneBookIfNothingFound(String nazwa){
        Optional<String> phoneNumber = kontakty.entrySet().stream()
                .filter(e->e.getKey().equals(nazwa))
                .map(Map.Entry::getValue)
                .findFirst();
        phoneNumber.ifPresentOrElse(
                System.out::println,
                this::printPhoneBook
        );
        return phoneNumber.orElse(null);
    }
    public Optional<String> findAnyNameByPhoneNumbersStartingWithPrefix(String prefix){
        return kontakty.entrySet().stream()
                .filter(p->p.getValue().startsWith(prefix))
                .map(Map.Entry::getKey)
                .findAny();
    }
}
