/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex10;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author LENOVO
 */
public class Ex10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        double co, ca, h;
       
        System.out.print("Cateto Oposto: ");
        co = input.nextDouble();
        
        System.out.print("Cateto Adjacente: ");
        ca = input.nextDouble();
        
        h = Math.sqrt(Math.pow(co, 2) + Math.pow(ca,2));
        
        System.out.print("Hipotenusa: "+ h);
    }
    
}
