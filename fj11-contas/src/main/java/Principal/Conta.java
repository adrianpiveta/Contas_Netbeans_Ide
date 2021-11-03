/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author Suporte
 */
public class Conta {	
    private double saldo;
    private String titular;
    private int numero;
    private String agencia;

    Conta(String titular) {
        this.titular=titular;
    }
    
    public boolean deposita(double valor){
        if (valor>0){
            this.saldo+=valor;
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean saca(double valor){
        if ((saldo-valor)>=0) {
            saldo-=valor;
            return true;
            
        }
        return false;
    }
    
    
}
