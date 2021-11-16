/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Classe de conta bancaria
 * @author Adrian Daniel Piveta
 */
public abstract class Conta implements Comparable<Conta>{	
    private double saldo;
    private String titular;
    private int numero;
    private String agencia;
    private LinkedList<Conta> contas;
    private HashMap<String, Conta> mapaContas;

    /**
     * Construtor
     * Inicia a classe com o nome do titular
     */
    
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
            throw new IllegalArgumentException("Valor negativo ou zero");
        }
    }
    
    /**
     * Retorna o saldo presente na conta
     * @return double Saldo
     */
    public double getSaldo(){
        return this.saldo;
    }
    
    /**
     * Classe de saque, na qual o saque é validado e realizado na conta
     * 
     * @param valor
     * @return boolean confirmação de saque
     * @throws Principal.SaldoInsulficienteException
     */
    public boolean saca(double valor) throws SaldoInsulficienteException{
        if (saldo<valor) {
            throw new SaldoInsulficienteException(saldo);
        }else{
            saldo-=valor;
            return true;
        }
    }

    /**
     *
     * @param saldo
     * @param titular
     * @param numero
     * @param agencia
     * @param tipoConta
     */
    public Conta(double saldo, String titular, int numero, String agencia) {
        this.saldo = saldo;
        this.titular = titular;
        this.numero = numero;
        this.agencia = agencia;
        mapaContas.put(titular, this);
       
    }
    
    /**
     * Retorna o tipo de conta que está sendo chamada por
     * este método
     * @return String tipoConta
     */
    public abstract String getTipoConta();
    
    public	String	recuperaDadosParaImpressao() {
			String	dados	=	"Titular:	"	+	this.titular;
			dados	+=	"\nNúmero:	"	+	this.numero;
			dados	+=	"\nAgência:	"	+	this.agencia;
			dados	+=	"\nSaldo:	R$"	+	this.saldo;
                        dados  += "\nTipo: " + this.getTipoConta();
			return dados;
    }

    @Override
    public int compareTo(Conta o) {
        return this.titular.compareTo(o.titular);
    }
    
    public void adiciona(Conta c){
        this.contas.add(c);
    }
    
    public Conta pega(int id){
        try {
            return this.contas.get(id);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }
    
    public int pegaQuantidadeDeContas(){
        return contas.size();
    }
    
    public Conta getConta(String nomeTitular){
        return mapaContas.get(nomeTitular);
    }

    public int hashCode() {
        String conta=agencia+numero;
        return (conta.hashCode()); 
    }
    
    
}
