/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author danie
 */
public class RepositorioDeContas {

    public RepositorioDeContas(List contas) throws IOException{
        String saida="";
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("Contas.txt", true));;
        } catch (Exception e) {
            System.out.println("deu ruim");
        }
        
        //try {
            //OutputStream os = new FileOutputStream("Contas.txt");
           //writer = new BufferedWriter(new FileWriter("Contas.txt"));
        //} catch (Exception e) {
       // }
        writer.write(saida);
        for (int i = 0; i < contas.size(); i++) {
            Conta conta1=(Conta) (contas.get(i));
            saida+=(String)conta1.getTipoConta()+","+conta1.getAgencia()+","+conta1.getTitular()+","
                    +conta1.getSaldo()+"\n";
        }
        writer.write(saida);
        writer.close();
    }  
    
    public List<Conta> carregaContas() throws FileNotFoundException, IOException{
        List<Conta> contas = new LinkedList<Conta>();
        BufferedReader leitor = new BufferedReader(new FileReader("Contas.txt"));
        String linha=leitor.readLine();
        
        while (linha !=null){
            Conta c1;
            
            String valores[]=linha.split(",");
            if(valores[0].contentEquals("Corrente")){
                c1= new ContaCorrente(Double.parseDouble(valores[3]) , valores[2], Integer.parseInt(valores[1]), valores[0]);
            }
            else{
                c1= new ContaPoupanca(Double.parseDouble(valores[3]) , valores[2], Integer.parseInt(valores[1]), valores[0]);
            }
            contas.add(c1);
            linha= leitor.readLine();
        }
        leitor.close();
        return contas;
    }           
    

    public RepositorioDeContas() {
    }


}
