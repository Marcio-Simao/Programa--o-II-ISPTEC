/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex05;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double Kz, Dollar, EUR, Real;
        
        
        System.out.println("Digite o valor em Kz: ");
        Kz = input.nextDouble();
        
        Dollar = Kz * 0.0011; 
        EUR = Kz * 0.00096 ;
        Real = Kz * 0.005648;
        
        int DollarInt = (int) Dollar;
        int EURInt = (int) EUR; 
        int RealInt = (int) Real;
        
        System.out.println("Conversão");
        System.out.print("Dollar: ");
        System.out.println(Kz+"kz = "+ DollarInt+"$" );
        System.out.print("Euro: ");
        System.out.println(Kz+"kz = "+ EURInt+"EUR" );
        System.out.print("Real: ");
        System.out.println(Kz+"kz = "+ RealInt+"R$" );
        
    }
    
}
