/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex02.pkg02;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex0202 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double notaFinal;
                
        System.out.print("Digite a nota final: ");
        notaFinal = input.nextDouble();
        
        String resultado = notaFinal >= 10 ? "Aprovado" : "Reprovado";
        
        System.out.println(resultado);
        
    }
    
}
