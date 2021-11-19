/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Runnable;

/**
 *
 * @author danie
 */
public class MostraNumeros implements Runnable{

    int idClass;
    
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Classe "+idClass+" numero atual: "+i);
            
        }
    }

    public int getIdClass() {
        return idClass;
    }

    public void setIdClass(int idClass) {
        this.idClass = idClass;
    }
    
    
}
