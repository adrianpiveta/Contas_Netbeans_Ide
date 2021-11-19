/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Runnable;

/**
 *
 * @author danie
 */
public class TestaRunnable {
    public static void main(String[] args) throws InterruptedException {
        MostraNumeros m1 = new MostraNumeros();
        m1.setIdClass(1);
        
        MostraNumeros m2 = new MostraNumeros();
        m2.setIdClass(2);
        
        Thread t1 = new Thread(m1);
        Thread t2 = new Thread(m2);
        
        t1.start();
        t2.start();
    }
    
}
