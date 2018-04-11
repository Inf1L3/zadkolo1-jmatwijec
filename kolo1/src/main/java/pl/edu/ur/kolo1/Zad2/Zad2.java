/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.kolo1.Zad2;

/**
 *
 * @author student
 */
public class Zad2 {

    int n;

    public Zad2() {
        
    }

    //https://stackoverflow.com/questions/26874794/java-fibonacci-recursion-code
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }
}
