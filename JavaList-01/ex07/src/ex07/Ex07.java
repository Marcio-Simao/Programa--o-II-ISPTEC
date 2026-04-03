/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex07;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double valorPago, precoLitro, quantLitro;
        
        System.out.print("Valor a ser pago: ");
        valorPago = input.nextDouble();
        
        System.out.print("Preço do litro: ");
        precoLitro = input.nextDouble();
        
        quantLitro = valorPago / precoLitro; 
        
        System.out.println("Litros: "+ quantLitro);
        
    }
    
}
