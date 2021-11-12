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
    
    public	void	ordenaLista(Evento	evento) {
        List<Conta>	contas	=	evento.getLista("destino");
	Collections.sort(contas);
			}

    private static class Evento {

        public Evento() {
        }

        private List<Conta> getLista(String destino) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    
}
