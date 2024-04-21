package zadanie4;

public class Employee {
    private String name;
    private String surname;
    private String email;
    private String pesel;
    private Double salary;
    private Double totalInvoicesAmount;

    public Employee(String name, String surname, String email, String pesel, Double salary) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.pesel = pesel;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "name: " + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", pesel='" + pesel + '\'' +
                ", salary=" + salary +
                ", totalInvoicesAmount=" + totalInvoicesAmount +
                '}';
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Double getTotalInvoicesAmount() {
        return totalInvoicesAmount;
    }

    public void setTotalInvoicesAmount(Double totalInvoicesAmount) {
        this.totalInvoicesAmount = totalInvoicesAmount;
    }
}
