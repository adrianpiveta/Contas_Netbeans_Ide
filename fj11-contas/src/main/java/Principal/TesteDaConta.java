/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *Classe de testes
 * @author Suporte
 */
public class TesteDaConta {

    public static void main(String[] args) throws SaldoInsulficienteException, FileNotFoundException {
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
                                //cc=null;
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
                            //cc=null;
                    }
        }
            catch(NullPointerException e){
                    System.out.println("erro: "+e);
                    }
            }
    
    //Testando divisão por 0
    int i=55;
    //i = i/0;
    System.out.println(i);
    //tentando abrir arquivo inexistente
    //new	java.io.FileInputStream("arquivo.txt");

    //testando com Try
    try	{
            FileInputStream fileInputStream = new	java.io.FileInputStream("arquivo.txt");
    }
    catch	(java.io.FileNotFoundException	e)	{
    System.out.println("Nao	foi	possível	abrir	o	arquivo	para	leitura");
    }
				

    //tratando mais de um tipo de erro por vez
    /*
    try	{
		objeto.metodoQuePodeLancarIOeSQLException();
    } catch	(IOException	e)	{
    }	catch	(SQLException	e)	{
    }
    */


    
    //exceção expecifica
    /*
    public	void	saca(double	valor) {
        if	(main("s")	<	valor)	{
            throw new	IllegalArgumentException();
	}	else	{
            this.saldo-=valor;								
        }								
    }
    */


    



    //teste que absorve a excessao e a printa
    
    
        try {
            cc.saca(50);
            System.out.println("consegui	sacar	da	poupança!");
        } catch (SaldoInsulficienteException ex) {
            System.out.println(ex);
        }

    //agrupamento que printa no caso de qualque erro
/*
				cc.saca(50);				
				System.out.println("consegui	sacar	da	corrente!");
				cp.saca(50);
				System.out.println("consegui	sacar	da	poupança!");




//criando a própria exceção
public class SaldoInsuficienteException extends RuntimeException	{				
				public	SaldoInsuficienteException(String	message) {
								super(message);
				}
}


public	void	saca(double	valor) {
				if	(this.saldo	<	valor)	{
								throw new	SaldoInsuficienteException("Saldo	Insuficiente,"	+"tente	um	valor	menor");
}
	else	{
this.saldo-=valor;
}
}



//testando a noss própria exceção
public	static	void	main(String[]	args) {
				Conta	cc	=	new	ContaCorrente();
				cc.deposita(10);								
				try	{
								cc.saca(100);
				}	catch	(SaldoInsuficienteException	e)	{
								System.out.println(e.getMessage());
				}
}

//extendendo try e catch
//o finally executa independente de cair no try ou no catch

try{}
catch{}
finally{}//executa de qualquer forma
    }*/
    Conta teste1= new ContaCorrente(4, "jose almirao", 1, "33");
    ContaPoupanca teste2= new ContaPoupanca(4, "jose almiro", 1, "33");
    ContaPoupanca teste3= new ContaPoupanca(4, "jose almiro", 1, "33");
    System.out.println(teste2.comparaConta(teste1) );
          


    
}
}
