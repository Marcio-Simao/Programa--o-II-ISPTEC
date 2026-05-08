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
        double[][] equipas = new double [5][3];
        int[] maiorAltura = new int [5];
        
        for(int i = 0; i < 5; i++)
        {
            System.out.println(i+"Equipa");
            for(int j = 0; j < 3; j++) 
            {
                System.out.println();
                equipas[i][j] = input.nextDouble();
            }
            System.out.println("-----------");
        }
        
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 3; j++) 
            {
                System.out.print(equipas[i][j]+" "); 
            }
            System.out.println(" ");
        }
    }
    
}
