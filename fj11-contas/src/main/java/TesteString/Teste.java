/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TesteString;

/**
 *
 * @author danie
 */
public class Teste {
    public static void main(String[] args) {
        String teste="Socorram-me,	 subi	 no	 ônibus	em Marrocos";
        teste=teste.toUpperCase(); //caixa alta
        teste=teste.replace("1", "3"); //troca os caracteres respondentes
        System.out.println(teste.charAt(3)); //retorna o caractere na posicao 3
        System.out.println(teste.length()); //retorna o tamanho
        System.out.println(teste.substring(2,4)); //retorna uma parte da string 
                                                   //de um indice a outro
        System.out.println(teste.indexOf("R")); //retorna o index de onde está 
                                                    //aquela parte de texto
        
        System.out.println(teste);
        
                
        for (int i = 0; i < teste.length(); i++) {
            System.out.println(teste.charAt(i));
            
        }
        
        for (int i = teste.length()-1; i >= 0; i--) {
            System.out.println(teste.charAt(i));
        }
        
        //Reescrita com StringBuilder
        
        
        StringBuilder testeBui=new StringBuilder(teste);
        
        for (int i = testeBui.length()-1; i >= 0; i--) {
            System.out.println(testeBui.charAt(i));
        }
        
        //valor de string em int //falha
        
        String numero="762";
        /*
        double numeroResp=0;
        for (int i = numero.length()-1; i >-1; i--) {
            System.out.println((float) (numero.charAt(i)));
            numeroResp= numeroResp + (double) (numero.charAt(i) -'0') *Math.pow(10, numero.length()-i-1);
            //System.out.println(numeroResp);
            
            //System.out.println(numero.charAt(i));
            //numeroResp += (double) numero.charAt(i)*(Math.pow(10, numero.length()-i-1));
            //System.out.println((numero.charAt(i)*(Math.pow(10, numero.length()-i-1))));
            //System.out.println(numero.charAt(i) +"="+ Math.pow(10, numero.length()-i-1));
            // System.out.println("Potencia: "+Math.pow(10, numero.length()-i-2));
            
            //int potencia=(int) Math.pow(10, numero.length()-i-2);
            //int resNumero=numero.charAt(i);
            //System.out.println(resNumero*potencia);
            //System.out.println("Numero: "+numero.charAt(i));
            //System.out.println(Math.pow(10, numero.length()-i-1)*(numero.charAt(i) -'0'));
            System.out.println(numeroResp);
        }
        */
        
        
        
        //correção do book
        /*
        int resultado = 0;
        while (numero.length()	> 0){
            char algarismo = numero.charAt(0);
            resultado = resultado * 10 + (algarismo -'0');
            numero = numero.substring(1);
        }
        System.out.println(resultado);
        */
        //minha correção após estudar o código do book
        double numeroResp=0;
        for (int i = numero.length()-1; i >-1; i--) {
            System.out.println((float) (numero.charAt(i)));
            numeroResp= numeroResp + (double) (numero.charAt(i) -'0') *Math.pow(10, numero.length()-i-1);
        }
        System.out.println(numeroResp);
    }
}
