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
        System.out.println("Iniciando...");
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
    }
}
