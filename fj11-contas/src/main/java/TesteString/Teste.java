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
        String teste="abrobrinha 123";
        teste=teste.toUpperCase(); //caixa alta
        teste=teste.replace("1", "3"); //troca os caracteres respondentes
        System.out.println(teste.charAt(3)); //retorna o caractere na posicao 3
        System.out.println(teste.length()); //retorna o tamanho
        System.out.println(teste.substring(2,4)); //retorna uma parte da string 
                                                   //de um indice a outro
        System.out.println(teste.indexOf("R")); //retorna o index de onde está 
                                                    //aquela parte de texto
        
        System.out.println(teste);
    }
}
