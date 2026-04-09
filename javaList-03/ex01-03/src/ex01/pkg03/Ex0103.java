/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01.pkg03;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex0103 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        int[] num = {2, 5, 8, 11, 14};
        int i;
        System.out.println("Olá Mundo!");
        
        for(i = 1; i < 5; i++)
        {
            num[i] = num[i] * 2;
        }
        
        for (int valor : num)
        {
            System.out.println(valor);
        }
    }
    
}
