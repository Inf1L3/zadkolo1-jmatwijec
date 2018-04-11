package pl.edu.ur.kolo1;

/**
 *
 * @author mchyla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Zad1 zadanie1 = new Zad1();
        Zad2 zadanie2 = new Zad2();
        int liczba = 10; // liczba do fib
        System.out.println(zadanie2.fib(liczba));
        Zad3 zadanie3 = new Zad3();
        zadanie3.wprowadz();
        zadanie3.wyswietl();
        System.out.println(zadanie3.srednia());
        Osoba zadanie4=new Osoba("maciek", "kowal", 10, 190, 60);
        zadanie4.pokazDane();
        // TODO Uruchomienie zadań/stworzenie i działanie na obiektach
    }
    
}
