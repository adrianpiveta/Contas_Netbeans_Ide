/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.*;

/**
 *
 * @author danie
 */
public class TestaMapa	{
    public	static	void	main(String[]	args) {
        Conta	c1	=	new	ContaCorrente(1);
        c1.deposita(10000);
        Conta	c2	=	new	ContaCorrente(1);
        c2.deposita(3000);
        //cria	o	mapa
        Map <String, Conta>	mapaDeContas	=	new	HashMap();
        //	adiciona	duas	chaves	e	seus	valores, a chave
        // é utilizada para  a busca
	mapaDeContas.put("diretor",	c1);
	mapaDeContas.put("gerente",	c2);
	//	qual	a	conta	do	diretor?
        
	Conta	contaDoDiretor	= mapaDeContas.get("diretor");
        try {
            System.out.println(contaDoDiretor.getSaldo());
        } catch (Exception e) {
            System.out.println("COnta nula");
        }
        
        //teste de adição de elemento na lista
        long	inicio	=	System.currentTimeMillis();
        //	trocar	depois	por	ArrayList
        List<Integer>	teste	=	new	LinkedList<>();
        for	(int	i	=	0;	i	<	30000;	i++)	{
                teste.add(0,	i);
        }
        long	fim	=	System.currentTimeMillis();
        double	tempo	=	(fim	-	inicio)	/	1000.0;
        System.out.println("Tempo gasto com linkedList:	"	+	tempo);
        
        //teste com Arraylist
        inicio	=	System.currentTimeMillis();
        //	trocar	depois	por	ArrayList
        teste	=	new	ArrayList<>();
        for	(int	i	=	0;	i	<	30000;	i++)	{
                teste.add(0,	i);
        }
        fim	=	System.currentTimeMillis();
        tempo	=	(fim	-	inicio)	/	1000.0;
        System.out.println("Tempo gasto com ArrayList:	"	+	tempo);
	}
}
