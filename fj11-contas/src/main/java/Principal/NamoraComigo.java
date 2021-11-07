/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;


import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class NamoraComigo {
    public static void main(String[] args) {
        Object[] opcoes={"sim", "nego meus sentimentos", "cancelar"};
        JPanel panel = new JPanel();
        panel.add(new JLabel ("Sinônimo de perfeição, quer namorar comigo"));
        int resultado=JOptionPane.showOptionDialog(null, panel,"pedido de namoro para a gatinha",
                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoes, null);
        if(resultado==JOptionPane.YES_NO_OPTION ){
            Object[] opcoesCasal = {"Vamos ter toda uma vida", "agora é nossa vida", "kiss-me"};
            JOptionPane.showMessageDialog(panel, "Agora somos um casal <3");
        }
    }
}
