/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03.pkg04;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex0304 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int[][] matriz = new int [5][2];
        int soma = 0;
        double media;
        
        for(int i = 0 ; i < 5; i++)
        {
            for(int j = 0; j < 2; j++)
            {
               System.out.print("[ "+ i +" ][ "+ j +" ]: ");
               matriz[i][j] = input.nextInt();
               soma = soma + matriz[i][j];
            }
        }
        media = soma / 10;
        System.out.println("Média: "+ media);
        
    }
    
}
