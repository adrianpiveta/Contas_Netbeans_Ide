/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author danie
 */
public class ManipuladorDeConta {

    public ManipuladorDeConta() {
    }
    
    public	void	ordenaLista(Evento	evento) {
        List<Conta>	contas	=	evento.getLista("destino");
	Collections.sort(contas);
			}

    private static class Evento {

        public Evento() {
        }

        private List<Conta> getLista(String destino) {
            return this.getLista(destino);
        }
        
     
    }
       public  boolean salvaDados(List dados){
           try {
              new  RespositorioDeContas(dados);
              return true;
           } catch (Exception e) {
               return false;
           }
        }
}
