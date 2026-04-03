/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex09;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author LENOVO
 */
public class Ex09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double peso, altura, IMC;
        
        System.out.print("Peso: ");
        peso = input.nextDouble();
        
        System.out.print("Altura: ");
        altura = input.nextDouble();
        
        IMC = peso / (Math.pow(altura,2));
        
        System.out.println("IMC: "+IMC);
        
    }
    
}
