/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04.pkg04;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random; // Importando a class
/**
 *
 * @author LENOVO
 */
public class Ex0404 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int[] k = new int[5];
        ArrayList<Integer> P = new ArrayList<Integer>();
        Random random = new Random(); // criando o nome 
        
        for(int i = 0; i < 5; i++)
        {
            k[i] = random.nextInt((100 - 1) + 1) + 1; // gerando números aleatorios, int numero = random.nextInt((max - min) + 1) + min;
        }
        for(int i = 0; i < 5; i++)
        {
            System.out.println(i+" K: "+ k[i]);
        }
    }
    
}
