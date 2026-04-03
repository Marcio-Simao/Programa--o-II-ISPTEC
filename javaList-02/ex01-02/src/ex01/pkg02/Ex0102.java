/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex01.pkg02;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author LENOVO
 */
public class Ex0102 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n1, n2, n3;
        
        System.out.print("N1: ");
        n1 = input.nextInt();
        
        System.out.print("N2: ");
        n2 = input.nextInt();
        
        System.out.print("N3: ");
        n3 = input.nextInt();
        
        if(n1 == n2 && n2 == n3)
        {
            System.out.println("Iguais");
        }
        else
        {
            System.out.println("Diferente");  
        }
    }
}
    

