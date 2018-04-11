/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.kolo1.Zad3;

import java.util.Scanner;

/**
 *
 * @author student
 */
public class Zad3 {

    private int[] liczby = new int[10];
   Scanner odczyt = new Scanner(System.in);
    public void wprowadz() {
        for(int i=0;i<10;i++)
        {
            System.out.println("podaj liczbe do" + i + " indeksu");
            int test = odczyt.nextInt();
            liczby[i]=test;
        }
    }
    public void wyswietl() {
         for(int i=0;i<10;i++)
         {
             System.out.println(liczby[i]);
         }
    }
    public int srednia()
    {
        int srednia =0;
        for(int i=0;i<10;i++ )
        {
            srednia +=liczby[i];
        }
        return srednia/10;
    }
    

}
