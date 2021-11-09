/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import Principal.*;

/**
 *Classe de conta bancaria
 * @author Adrian Daniel Piveta
 */
public interface Conta {	
  
    /**
     * Realiza um depósito e a sua validação na classe conta
     * @param valor double -> valor que será depositado na conta
     * @return boolean -> confrmação de deposito
    */
    public boolean deposita(double valor);
    
    /**
     * Retorna o saldo presente na conta
     * @return double Saldo
     */
    public double getSaldo();
        
    /**
     * Classe de saque, na qual o saque é validado e realizado na conta
     * 
     * @return boolean confirmação de saque
     */
    public boolean saca(double valor);

    /**
     * Atualiza a taxa Selic
     * @param taxaSelic
     */
    public void atualiza(double taxaSelic);

    /**
     * Retorna o tipo de conta que está sendo chamada por
     * este método
     * @return String tipoConta
     */
    public abstract String getTipoConta();
    
    public abstract String recuperaDadosParaImpressao();
    
    
    public abstract String toString();

}
