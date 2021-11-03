/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Suporte
 */
public class TesteDaConta {

    public static void main(String[] args) {
        Conta c1= new Conta("Jose");
        
        c1.deposita(100);
        
        System.out.println(c1.saca(100));
    }
}
