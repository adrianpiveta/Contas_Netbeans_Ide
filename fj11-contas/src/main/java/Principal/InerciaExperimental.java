/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author danie
 */
public class InerciaExperimental {
    public static void main(String[] args) {
        double raioP=0.02565;
        double massa = 0.05683;
        double tempo = 5.95;
        double gravidade=9.80665;
        double altura=1.57;
        
        double a = Math.pow(raioP, 2)*massa;
        double b = ((Math.pow(tempo, 2)*gravidade)/(altura*2))-1;
        System.out.println(a*b);
        
        
    }
            
}
