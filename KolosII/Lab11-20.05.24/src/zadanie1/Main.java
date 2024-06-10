package zadanie1;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        generateNumberStream();
    }
    public static void generateNumberStream(){
        Stream.iterate(0,number->number+1)
                .filter(number->number>10)
                .filter(number->number<100)
                .filter(number->number%3==0)
                .limit(20)//zmiana kolejności ma znaczenie
                .map(number->number*3)
                .forEach(System.out::println);
    }
}
