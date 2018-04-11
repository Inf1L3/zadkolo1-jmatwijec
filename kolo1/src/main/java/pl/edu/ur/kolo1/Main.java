package pl.edu.ur.kolo1;

import pl.edu.ur.kolo1.Zad4.Osoba;
import pl.edu.ur.kolo1.Zad3.Zad3;
import pl.edu.ur.kolo1.Zad2.Zad2;
import pl.edu.ur.kolo1.Zad1.Zad1;
import java.util.Scanner;

/**
 *
 * @author mchyla
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner odczyt = new Scanner(System.in);
        System.out.println("podaj nr zadania");
        int n = odczyt.nextInt();
        switch (n) {
            case 1: {
                Zad1 zadanie1 = new Zad1();
            }
            break;
            case 2: {
                Zad2 zadanie2 = new Zad2();
                System.out.println("podaj nr ciagu");
                int liczba = odczyt.nextInt();// liczba do fib
                System.out.println(zadanie2.fib(liczba));
            }
            break;
            case 3: {
                Zad3 zadanie3 = new Zad3();
                zadanie3.wprowadz();
                zadanie3.wyswietl();
                System.out.println("srednia"+zadanie3.srednia());
            }
            break;
            case 4: {
                Osoba zadanie4 = new Osoba("maciek", "kowal", 10, 190, 60);
                zadanie4.pokazDane();
            }
            break;
        }
        // TODO Uruchomienie zadań/stworzenie i działanie na obiektach
    }

}
