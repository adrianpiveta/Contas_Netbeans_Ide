/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *Classe de conta bancaria
 * @author Adrian Daniel Piveta
 */
public class Conta {	
    private double saldo;
    private String titular;
    private int numero;
    private String agencia;

    /**
     * Construtor
     * Inicia a classe com o nome do titular
     */
    Conta(String titular) {
        this.titular=titular;
    }
    
    /**
     * Realiza um depósito e a sua validação na classe conta
     * @param valor double -> valor que será depositado na conta
     * @return boolean -> confrmação de deposito
    */
    public boolean deposita(double valor){
        if (valor>0){
            this.saldo+=valor;
            return true;
        }
        else{
            return false;
        }
    }
    
    /**
     * Classe de saque, na qual o saque é validado e realizado na conta
     * 
     * @return boolean confirmação de saque
     */
    public boolean saca(double valor){
        if ((saldo-valor)>=0) {
            saldo-=valor;
            return true;
            
        }
        return false;
    }
    
    
}
