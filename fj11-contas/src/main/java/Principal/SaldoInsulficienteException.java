/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author danie
 */
public class SaldoInsulficienteException extends Exception{

    public SaldoInsulficienteException(String mensagem) {
        super(mensagem);
    }

    public SaldoInsulficienteException(double saldoDisponivel) {
        super("Saldo disponível de: "+saldoDisponivel);
    }
    
    
    
    
}
