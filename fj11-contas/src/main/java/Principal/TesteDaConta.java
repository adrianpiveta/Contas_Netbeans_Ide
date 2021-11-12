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
        
        //c2.saca(2222);
        
        
        try{
            c1.saca(10);
        }
        catch (IllegalArgumentException e){
            System.out.println(e);
        }
        
        Conta cc = new ContaCorrente(3, "jose", 11, "33");
        try{
                for(int i=0; i<=15; i++){
                        cc.deposita(i+1000);
                                  System.err.println(cc.getSaldo());
                        if(i==5){
                                cc=null;
                        }
                }}
                catch(NullPointerException e){
                                  System.out.println("erro: "+e);
                }



        for(int i=0; i<=15; i++){
            try{
                    cc.deposita(i+1000);
                    System.out.println(cc.getSaldo());
                    if(i==5){
                            cc=null;
                    }
        }
            catch(NullPointerException e){
                    System.out.println("erro: "+e);
                    }
            }
    
    //Testando divisão por 0
    int i=55;
    i = i/0;
    System.out.println(i);
    }
}
