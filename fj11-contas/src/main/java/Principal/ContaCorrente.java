/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * você	 precisa	 pagar	 1%	 da	conta,	e	 o	
 * SeguroDeVida		tem	 uma	taxa	 fixa	 de	 42 
 * reais	mais	2%	do	valor	do	seguro.
 * @author danie
 */
public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(double saldo, String titular, int numero, String agencia) {
        super(saldo, titular, numero, agencia);
    }

    public ContaCorrente(int nada) {
        super(0, "Alguem", 0, "000");
    }

    @Override
    public String getTipoConta() {
        return "Corrente";
    }

    @Override
    public double getValorImposto() {
        return (getSaldo() * 0.01 + 42 * 1.02);
    }
    
    @Override
    public boolean saca(double valorSaque) throws SaldoInsulficienteException{
        try {
            super.saca(valorSaque);
        } catch (Exception e) {
            throw new SaldoInsulficienteException(valorSaque);
        }
        return false;
    }
    
}
