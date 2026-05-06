/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex04.pkg04;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
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
        Random random = new Random(); 
       
        //recebendo os valores
        for(int i = 0; i < 5; i++)
        {
            k[i] = random.nextInt((10 - 0) + 1) + 1; 
            System.out.println(k[i]);
        }
        // Verificar
        for (int i = 0; i < 5; i++) 
        {
            int n = k[i];
            boolean ehPrimo = true;

            if (n <= 1) 
            {
                ehPrimo = false;    
            } else {
                for (int d = 2; d <= Math.sqrt(n); d++) {
                    if (n % d == 0) 
                    {
                        ehPrimo = false;
                        break;
                    }
                }
            }
            if (ehPrimo) 
            {
                P.add(n);
            }
        }
        //Mostrar
        System.out.println("Números primos:");
        System.out.println(P);
    }
}
