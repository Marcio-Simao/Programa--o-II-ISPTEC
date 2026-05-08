/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex07.pkg04;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author LENOVO
 */
public class Ex0704 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        double[][] equipas = new double [3][2];
        double[] maiorAltura = new double [2];
        
        for(int i = 0; i < 2; i++) // Equipas
        {
            System.out.println(i+"-Equipa");
            for(int j = 0; j < 3; j++) //jogadores
            {
                System.out.print(j+"-Jogador: ");
                equipas[j][i] = input.nextDouble();
            }
            System.out.println("-----------");
        }
        
        for(int i = 0; i < 2; i++) // Equipas
        {
            System.out.println(i+"-Equipa");
            for(int j = 0; j < 3; j++) //jogadores
            {
                if(maiorAltura[i] <  equipas[j][i])
                {
                    maiorAltura[i] =  equipas[j][i];
                }
                
            }
            System.out.println("-----------");
        }
        
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 2; j++) 
            {
                System.out.print(equipas[i][j]+" "); 
            }
            System.out.println(" ");
        }
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 2; j++) 
            {
                System.out.print(equipas[i][j]+" "); 
            }
            System.out.println(" ");
        }
    }
    
    
}
