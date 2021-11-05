/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author danie
 */
public class ContaPoupanca extends Conta{

    
    public ContaPoupanca(double saldo, String titular, int numero, String agencia) {
        super(saldo, titular, numero, agencia);
    }
    
    /**
     * Retorna o tipo de conta que é
     * @return String tipoConta
     */
    public String getTipoConta(){
        return "Poupança";
    }
}
