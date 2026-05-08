/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex08.pkg04;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex0804 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[][] matriz = new int[10][10];
        
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                if(i < j)
                {
                    matriz[i][j] = (2 * i) + (7 * j) - 2;
                }else{
                    if(i > j)
                    {
                        matriz[i][j] = (4 * i * 3) - (5 * j * 2) + 1;
                    }else{
                        matriz[i][j] = (3 * i * 2) -1;
                    }
                }
            }
        }
        for(int i = 0; i < 10; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.print(matriz[i][j]);
            }
            System.out.println(" ");
        }    
    }
    
}
