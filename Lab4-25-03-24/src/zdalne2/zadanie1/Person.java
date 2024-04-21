package zdalne2.zadanie1;
public class Person implements Comparable<Person> {

    private final String PESEL;
    private String name;
    private String surname;

    public Person(String PESEL, String name, String surname) {
        this.PESEL = PESEL;
        this.name = name;
        this.surname = surname;
    }

    public String getPESEL() {
        return PESEL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Person{" +
                "PESEL='" + PESEL + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person otherPerson) {
        return this.PESEL.compareTo(otherPerson.PESEL);
    }

    // implementing ordering people by surname (or name if surnames are equal)
//        @Override
//        public int compareTo(Person otherPerson) { // metoda compareTo zwraca int równy -1/0/1 w zależności od wyniku porównania (mniejsze/równe/większe)
//                int c =  this.surname.compareTo(otherPerson.surname);
//                if(c == 0) { // jeśli nazwiska są równe
//                    return this.name.compareTo(otherPerson.name); // zawracamy wynik z porównania imienia
//                }
//                return c;
//            }

}
