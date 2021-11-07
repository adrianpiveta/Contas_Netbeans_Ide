/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *Classe de testes
 * @author Suporte
 */
public class TesteDaConta {

    public static void main(String[] args) throws SaldoInsulficienteException {
        Conta c1= new ContaPoupanca(22, "ze", 1, "875");
        Conta c2= new ContaCorrente(22, "ze", 1, "875");
        
        c1.deposita(100);
        
        System.out.println(c1.saca(100));
        
        System.out.println(c1.getTipoConta());
        System.out.println(c2.getTipoConta());
        
        System.out.println(c1.recuperaDadosParaImpressao());
        
        try{
            c1.saca(1000);
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }
    }
}
