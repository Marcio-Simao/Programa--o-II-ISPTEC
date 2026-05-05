/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02.pkg04;
import java.util.Scanner;
import 
/**
 *
 * @author LENOVO
 */
public class Ex0204 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int numero = = rand.nextInt();
        int [][] matriz = new int [5][5];
        
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.print("[ "+ i +" ][ "+ j +" ]: ");
                matriz[i][j] = input.nextInt();
            }
        }
        
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 5; j++)
            {
              
            }
        }
    }
    
}
