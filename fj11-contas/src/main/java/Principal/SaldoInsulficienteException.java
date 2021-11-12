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

    /**
     * retorna excessão informando que não dá para sacar e mostra saldo 
     * disponivel
     * @param saldoDisponivel
     */
    public SaldoInsulficienteException(double saldoDisponivel) {
        super("Saldo disponível de: " + saldoDisponivel);
    }
    
    /**
     * Retorna excessão para saque informando que não dá para sacar x valor
     * @param valorSaque
     */
    public SaldoInsulficienteException (float valorSaque){
        super("Impossível sacar R$" + valorSaque );
    }
    
    
    
    
}
