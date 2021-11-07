/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import Principal.*;

/**
 *
 * você	 precisa	 pagar	 1%	 da	conta,	e	 o	
 * SeguroDeVida		tem	 uma	taxa	 fixa	 de	 42 
 * reais	mais	2%	do	valor	do	seguro.
 * @author danie
 */
public class ContaCorrente implements Conta, Tributavel{

    private double saldo;
    private String titular;
    private String agencia;
    private int numero;
    private double taxaSelic;
    
    public ContaCorrente(double saldo, String titular, int numero, String agencia) {
        this.agencia=agencia;
        this.saldo=saldo;
        this.titular=titular;
        this.numero=numero;
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
    public boolean deposita(double valor) {
        this.saldo+=valor;
        return true;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public boolean saca(double valor) {
        this.saldo-=valor;
        return true;
    }

    @Override
    public void atualiza(double taxaSelic) {
        this.taxaSelic=taxaSelic;
    }

    @Override
    public String recuperaDadosParaImpressao() {
        return "teste";
    }
    
    @Override
    public String toString(){
        return this.recuperaDadosParaImpressao();
    }
    
}
