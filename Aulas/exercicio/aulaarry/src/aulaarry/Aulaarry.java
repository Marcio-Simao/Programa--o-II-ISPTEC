/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aulaarry;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author LENOVO
 */
public class Aulaarry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        int[] vetor = new int[10];
        int maior = 0, menor = 0;
        System.out.println("Oi, Lua!");
        for(int i = 0; i < 10; i++)
        {
          System.out.print("posição "+ i+ ": ");
          vetor[i] = input.nextInt();
          if(i == 0)
          {
              maior = vetor[i];
              menor = vetor[i];
          }else{
             if(maior < vetor[i])
             {
                maior = vetor[i];
             } 
             if(menor > vetor[i])
             {
                 menor = vetor[i];
             }
          }
        }
        System.out.println("Maior valor: "+ maior);
        System.out.println("menor valor: "+ menor);
        
    }
    
}
