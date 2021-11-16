/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

/**
 *
 * @author danie
 */
public class OrdenaNumeros {
    public static void main(String[] args) {
        
        Random numero = new Random();
        
        TreeSet<Integer> numeros= new TreeSet<Integer>();
        for (int i = 110; i > 100; i--) {
            numeros.add(numero.nextInt(i));
        }

        System.out.println(numeros.descendingSet());
        System.out.println(numeros.toString());
        Iterator<Integer> ordenador = numeros.iterator();
        System.out.println(numeros.toString());
    }
}
