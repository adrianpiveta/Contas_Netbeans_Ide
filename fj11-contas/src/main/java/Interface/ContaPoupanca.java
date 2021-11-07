/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interface;

import Principal.*;

/**
 *
 * @author danie
 */
public class ContaPoupanca implements Conta{
    private double saldo;
    private String titular;
    private String agencia;
    private int numero;
    private double taxaSelic;

    /**
     * Constrói conta poupanca
     * @param saldo
     * @param titular
     * @param agencia
     * @param numero
     */
    public ContaPoupanca(double saldo, String titular, String agencia, int numero) {
        this.saldo = saldo;
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }
    
    
    /**
     * Retorna o tipo de conta que é
     * @return String tipoConta
     */
    public String getTipoConta(){
        return "Poupança";
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
}
