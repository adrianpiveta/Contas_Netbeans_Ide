/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.io.*;
import java.util.List;

/**
 *
 * @author danie
 */
public class RespositorioDeContas {

    public RespositorioDeContas(List contas) throws IOException{
        String saida="\nsalvamento\n";
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
}
