/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex19.pkg03;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex1903 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int quant = 1;
        
        for(int i = 1; i <= 5; i++)
        {
            for(int j = 1; j <= 5; j++)
            {
                if(i == 1 && j == 1)
                {
                    quant = 1;
                }else{
                    quant = quant * 2;
                }
            }
        }    
        System.out.println("O Monge recebera "+ quant +" graos de trigo");
    }
    
}
