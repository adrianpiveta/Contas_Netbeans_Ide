/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Principal;

/**
 *
 * @author danie
 */
public class Matrizona {
    public static void main(String[] args) {
        /*for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                            System.out.print("|  |");
            
        }
                        System.out.print("    |    ");
        }
                    System.out.println("");
        }
                System.out.println("");
        }
            System.out.println("");
        }
        */
        int [][][][][] p = new int[3][3][3][3][3];
        p[2][2][1][1][1] =1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        for (int m = 0; m < 3; m++) {
                            System.out.print(p[i][j][k][l][m]);
            
        }
                        System.out.print("    |    ");
        }
                    System.out.println("");
        }
                System.out.println("");
        }
            System.out.println("");
        }
    }
    
}


