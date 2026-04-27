/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package questao.pkg02;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Questao02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30};

        System.out.println("Tamanho do vetor: " + numeros.length);
        System.out.println("Índice 0: " + numeros[0]);
        System.out.println("Índice 1: " + numeros[1]);
        System.out.println("Índice 2: " + numeros[2]);

        // Tentando acessar um índice que não existe
        System.out.println("Índice 5: " + numeros[5]);
        
    }
    
}
