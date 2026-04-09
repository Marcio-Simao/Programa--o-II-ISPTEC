/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex03.pkg03;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex0303 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int factorial = 1, n;
        
        System.out.print("Digie o número: ");
        n = input.nextInt();
        for (int i = n; i > 1; i--)
        {
            factorial *= i;  
        }
        
        System.out.println("O factorial de "+ n +" e "+ factorial);    
    }
    
}
