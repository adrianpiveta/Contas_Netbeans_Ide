/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 * Classe de conta bancaria
 * @author Adrian Daniel Piveta
 */
public abstract class Conta implements Comparable<Conta>{	
    private double saldo;
    private String titular;
    private int numero;
    private String agencia;

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
        if((this.titular.toLowerCase()) == (o.titular.toLowerCase()) ){
            return 1;
        }
        return 0;
    }
}
