/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex06;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author LENOVO
 */
public class Ex06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double r,C,A ;
        System.out.print("Digite o raio do circulo: ");
        r = input.nextDouble();
        System.out.println("area do circulo: "+ Math.PI * (Math.pow(r,2)) );
        System.out.println("Comprimento do circulo: "+ 2 * Math.PI * r);
        
    }
    
}
