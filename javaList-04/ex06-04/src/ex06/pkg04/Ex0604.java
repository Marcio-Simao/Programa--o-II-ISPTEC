/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex06.pkg04;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex0604 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int [7][8];
        
        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                matriz[i][j] = i + j; 
            }
        }
        for(int i = 0; i < 7; i++)
        {
            for(int j = 0; j < 8; j++)
            {
                System.out.print(matriz[i][j]+" "); 
            }
            System.out.println(" ");
        }
    }
    
}
