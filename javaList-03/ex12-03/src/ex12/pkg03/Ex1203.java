/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex12.pkg03;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class Ex1203 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num, numInvertido = 0, test, ultimoDigito;
        
        System.out.print("Digite um número: ");
        num = input.nextInt();
        
        while(num != 0)
        {
            ultimoDigito = num % 10;
            numInvertido = (numInvertido * 10) + ultimoDigito;
            num = num / 10;
        }
   
        System.out.println(numInvertido);
        
    }
    
}
