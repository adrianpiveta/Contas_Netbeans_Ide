/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.awt.List;
import java.util.Collection;
import java.util.LinkedList;

/**
 *
 * @author danie
 */
public class Banco {
    
    public static void main(String[] args) {
        String conta= "conta";
        String nome="conta";
        String titular="zé";
        String agencia= "001";
        double saldo = 0;
        int numero=0;
        
        ContaCorrente c1= new ContaCorrente(saldo, titular, 2, agencia);
        
        LinkedList<Conta> contas = new LinkedList<>();
        int quantidadeContas=10;
        
        
        //Criando varias correntes
        for (int i = 1; i < quantidadeContas+1; i++) {
            contas.add(new ContaCorrente(saldo, titular+i, i, agencia));
        }
        
        for (int i = 1; i < quantidadeContas+1; i++) {
            contas.add(new ContaPoupanca(i, titular+i, i, agencia));
        }
        
        for (int i = 1; i < contas.size(); i++) {
            System.out.println("Saldo: "+contas.get(i).getSaldo() +"\n");
            
        }
    }
    
}
