/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 *
 * @author danie
 */
public class TestaPerformance	{
    public	static	void	main(String[]	args) {

        //Teste com HashSet
        Collection<Integer>	teste	=	new HashSet<>();
        long	inicio	=	System.currentTimeMillis();
	int	total	=	30000;
	for	(int	i	=	0;	i	<	total;	i++)	{
            teste.add(i);
	}
        long tempoInsercao=System.currentTimeMillis()-inicio;
        System.out.println("tempo de adição: "+tempoInsercao);
        for	(int	i	=	0;	i	<	total;	i++)	{
            teste.contains(i);
        }
        long tempoBusca=System.currentTimeMillis()-inicio-tempoInsercao;
        System.out.println("tempo de busca: "+(tempoBusca));
        System.out.println("Tempo	gasto:	" + (tempoInsercao+tempoBusca));
        
        //teste com ArrayList
        System.out.println("\n Tempo com ArrayList");
        Collection<Integer>	teste1	=	new ArrayList<>();
        long	inicio1	=	System.currentTimeMillis();
	int	total1	=	30000;
	for	(int	i	=	0;	i	<	total;	i++)	{
            teste1.add(i);
	}
        long tempoInsercao1=System.currentTimeMillis()-inicio1;
        System.out.println("tempo de adição: "+tempoInsercao1);
        for	(int	i	=	0;	i	<	total1;	i++)	{
            teste1.contains(i);
        }
        long tempoBusca1=System.currentTimeMillis()-inicio1-tempoInsercao1;
        System.out.println("tempo de busca: "+(tempoBusca1));
        System.out.println("Tempo	gasto:	" + (tempoInsercao1+tempoBusca1));
    }
}
