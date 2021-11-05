/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author danie
 */
public class ContaCorrente extends Conta{

    public ContaCorrente(double saldo, String titular, int numero, String agencia) {
        super(saldo, titular, numero, agencia);
    }

    @Override
    public String getTipoConta() {
        return "Corrente";
    }
    
}
